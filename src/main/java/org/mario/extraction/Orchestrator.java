package org.mario.extraction;

import java.io.IOException;
import java.util.List;

public class Orchestrator {
    public void extractionOrchestrator(String folderName, String targetPath) throws IOException {
        Writer writer = new Writer();
        List<String> masterStringList = writer.buildJson(folderName);
        int suffix = 0;
        for (String intermediateString : masterStringList) {
            String newTargetPath = targetPath.replace(".json","_") + suffix + ".json";
            writer.saveFile(newTargetPath, intermediateString);
            suffix += 1;
        }
    }
}