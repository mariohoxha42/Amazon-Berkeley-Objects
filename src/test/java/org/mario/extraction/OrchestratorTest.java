package org.mario.extraction;

import org.testng.annotations.Test;

import java.io.IOException;

public class OrchestratorTest {
    @Test
    public void orchestratorTest() throws IOException {
        Orchestrator orchestrator = new Orchestrator();
        String folderName = "src/test/resources/listings";
        String targetPath = "target/generated-test-sources/test-orchestrator-file.json";
        orchestrator.extractionOrchestrator(folderName, targetPath);
    }
}
