package org.mario;

import org.mario.process.analyze.AnalysisOrchestrator;
import org.mario.process.extract.ExtractionOrchestrator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		ExtractionOrchestrator extractionOrchestrator = new ExtractionOrchestrator();
		AnalysisOrchestrator analysisOrchestrator = new AnalysisOrchestrator();
		
		String rawFolderName = args[0];
		String extractionTargetPath = args[1];
		extractionOrchestrator.extractionOrchestrator(rawFolderName, extractionTargetPath);
		
		List<String> keySourceSplit = new ArrayList<>(List.of(extractionTargetPath.split("/")));
		String keySourcePath = String.join("/", keySourceSplit.subList(0, 4));
		String keyTargetPath = keySourcePath.replace("generated", "key");
		analysisOrchestrator.analysisOrchestrator(keySourcePath, keyTargetPath);
	}
}