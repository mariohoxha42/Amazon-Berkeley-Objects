package org.mario;

import org.testng.annotations.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void testMain() throws IOException {
        String folderName = "src/test/resources/listings";
        String targetPath = "src/test/resources/generated-test-files/test-orchestrator-file.json";
        String [] args = {folderName, targetPath};
        Main.main(args);
    }
}
