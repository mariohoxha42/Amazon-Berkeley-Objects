package org.mario.extraction;

import java.io.IOException;

import static org.mario.extraction.Writer.buildJson;
import static org.mario.extraction.Writer.saveFile;

public class Orchestrator {
    public static void extractionOrchestrator(String folderName, String targetPath) throws IOException {
        String jsonString = buildJson(folderName);
        saveFile(targetPath, jsonString);
    }
}
