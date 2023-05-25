package org.mario.extraction;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.testng.annotations.Test;

import java.io.IOException;

public class WriterTest {
    @Test
    public void buildJsonTest() throws IOException {
        String folderName = "src/test/resources/listings";
        Writer.buildJson(folderName);
    }

    @Test
    public void saveFileTest() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key-1", "value-1");
        jsonObject.addProperty("key-2", "value-2");
        String jsonString = new Gson().toJson(jsonObject);

        String targetPath = "target/generated-test-sources/test-save-file.json";

        Writer.saveFile(targetPath, jsonString);
    }
}
