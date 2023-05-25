package org.mario.extraction;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Writer {
    public static String buildJson(String folderName) throws IOException {
        List<Map> mapList = Parser.parseFolder(folderName);
        return new Gson().toJson(mapList);
    }

    public static void saveFile(String targetPath, String jsonString) throws IOException {
        FileWriter file = new FileWriter(targetPath);
        file.write(jsonString);
        file.close();
    }
}
