package org.mario.extraction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonStreamParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Orchestrator {
    public void extractionOrchestrator(String folderName, String targetPath) throws IOException {
        String jsonString = buildJson(folderName);
        saveFile(targetPath, jsonString);
    }

    public List<Map> parseFile(String filePath, String fileName) throws IOException {

        String fullPath = filePath + "/" + fileName;
        InputStream is = Orchestrator.class.getClassLoader().getResourceAsStream(fullPath);
        Reader inputReader = new InputStreamReader(is, StandardCharsets.UTF_8);

        Gson gson = new GsonBuilder().create();
        JsonStreamParser parser = new JsonStreamParser(inputReader);

        List<Map> mapList = new ArrayList<>();

        while (parser.hasNext()) {
            JsonElement jsonElement = parser.next();
            if (jsonElement.isJsonObject()) {
                Map map = gson.fromJson(jsonElement, Map.class);
                mapList.add(map);
            }
        }
        return mapList;
    }

    public List<Map> parseFolder(String filePath) throws IOException {

        List<Map> masterMapList = new ArrayList<>();
        File folder = new File(filePath);
        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                String individualFilePath = filePath.replaceAll("src/.*/resources/", "");
                System.out.println("File is " + individualFilePath + "/" + file.getName());
                List<Map> parsedList = parseFile(individualFilePath, file.getName());
                masterMapList.addAll(parsedList);
            } else if (file.isDirectory()) {
                String newFilePath = filePath + "/" + file.getName();
                List<Map> intermediateList =  parseFolder(newFilePath);
                masterMapList.addAll(intermediateList);
            }
        }
        return masterMapList;
    }

    public String buildJson(String folderName) throws IOException {
        Gson gson = new Gson();
        List<Map> mapList = parseFolder(folderName);
        return gson.toJson(mapList);
    }

    public void saveFile(String targetPath, String jsonString) throws IOException {
        FileWriter file = new FileWriter(targetPath);
        file.write(jsonString);
        file.close();
    }
}
