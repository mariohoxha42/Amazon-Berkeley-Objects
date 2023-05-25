package org.mario.extraction;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Writer {
    Parser parser = new Parser();

    public List<String> buildJson(String folderName) throws IOException {
        Gson gson = new Gson();
        List<List<Map>> masterMapList = parser.parseFolder(folderName);
        List<String> masterStringList = new ArrayList<>();
        for (List<Map> intermediateList : masterMapList) {
            String intermediateString = gson.toJson(intermediateList);
            masterStringList.add(intermediateString);
        }
        return masterStringList;
    }

    public void saveFile(String targetPath, String jsonString) throws IOException {
        FileWriter file = new FileWriter(targetPath);
        file.write(jsonString);
        file.close();
    }
}
