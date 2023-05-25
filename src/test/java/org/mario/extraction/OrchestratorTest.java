package org.mario.extraction;

import org.testng.annotations.Test;

import java.io.IOException;

public class OrchestratorTest {
    Orchestrator orchestrator = new Orchestrator();

    @Test
    public void orchestratorTest() throws IOException {
        String folderName = "src/test/resources/listings";
        String targetPath = "target/generated-test-sources/test-orchestrator-file.json";
        orchestrator.extractionOrchestrator(folderName, targetPath);
    }
}
