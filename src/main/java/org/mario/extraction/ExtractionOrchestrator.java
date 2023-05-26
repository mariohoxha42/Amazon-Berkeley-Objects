package org.mario.extraction;

import java.io.IOException;
import java.util.List;

public class ExtractionOrchestrator {
    public void extractionOrchestrator(String rawFolderName, String extractionTargetPath) throws IOException {
        Writer writer = new Writer();
        List<String> masterStringList = writer.buildJson(rawFolderName);
        int suffix = 0;
        for (String intermediateString : masterStringList) {
            String newTargetPath = extractionTargetPath.replace(".json", "_") + suffix + ".json";
            writer.saveFile(newTargetPath, intermediateString);
            suffix += 1;
        }
    }
}