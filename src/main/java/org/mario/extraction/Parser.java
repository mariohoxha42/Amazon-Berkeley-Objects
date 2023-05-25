package org.mario.extraction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonStreamParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Parser {
    public static List<Map> parseFile(String filePath, String fileName) throws IOException {

        String fullPath = filePath + "/" + fileName;
        InputStream is = Parser.class.getClassLoader().getResourceAsStream(fullPath);
        Reader inputReader = new InputStreamReader(is, "UTF-8");

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

    public static List<Map> parseFolder(String filePath) throws IOException {

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
                parseFolder(newFilePath);
            }
        }
        return masterMapList;
    }
}