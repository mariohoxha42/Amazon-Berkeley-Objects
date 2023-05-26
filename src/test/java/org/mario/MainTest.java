package org.mario;

import org.testng.annotations.Test;

import java.io.IOException;

public class MainTest {
	@Test
	public void testMain() throws IOException {
		String rawFolderName = "src/test/resources/listings";
		String extractionTargetPath = "src/test/resources/generated-test-files/test-orchestrator-file.json";
		String[] args = {rawFolderName, extractionTargetPath};
		Main.main(args);
	}
}