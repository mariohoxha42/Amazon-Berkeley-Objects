package org.mario.extraction;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Writer {
    Parser parser = new Parser();

    public List<String> buildJson(String rawFolderName) throws IOException {
        Gson gson = new Gson();
        List<List<Map>> masterMapList = parser.parseFolder(rawFolderName);
        List<String> masterStringList = new ArrayList<>();
        for (List<Map> intermediateList : masterMapList) {
            String intermediateString = gson.toJson(intermediateList);
            masterStringList.add(intermediateString);
        }
        return masterStringList;
    }

    public void saveFile(String newTargetPath, String intermediateString) throws IOException {
        FileWriter file = new FileWriter(newTargetPath);
        file.write(intermediateString);
        file.close();
    }
}
