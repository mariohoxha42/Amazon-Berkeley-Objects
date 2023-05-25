package org.mario.extraction;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.testng.annotations.Test;

import java.io.IOException;

public class WriterTest {
    @Test
    public void buildJsonTest() throws IOException {
        String folderName = "src/test/resources/listings";
        Writer writer = new Writer();
        writer.buildJson(folderName);
    }

    @Test
    public void saveFileTest() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key-1", "value-1");
        jsonObject.addProperty("key-2", "value-2");
        String jsonString = new Gson().toJson(jsonObject);

        String targetPath = "target/generated-test-sources/test-save-file.json";

        Writer writer = new Writer();
        writer.saveFile(targetPath, jsonString);
    }

    @Test
    public void orchestratorTest() throws IOException {
        Writer writer = new Writer();
        String folderName = "src/test/resources/listings";
        String targetPath = "target/generated-test-sources/test-orchestrator-file.json";
        writer.extractionOrchestrator(folderName, targetPath);
    }
}
