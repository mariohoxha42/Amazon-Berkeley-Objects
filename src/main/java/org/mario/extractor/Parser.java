package org.mario.extractor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonStreamParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Parser {
    public List<Map> parseFile(String filePath, String fileName) throws IOException {

        String fullPath = filePath + fileName;
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
}