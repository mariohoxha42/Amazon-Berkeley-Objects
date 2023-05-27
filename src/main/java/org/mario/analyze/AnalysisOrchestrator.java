package org.mario.analyze;

import java.io.IOException;
import java.util.HashSet;

import static org.mario.utils.Utils.saveFile;

public class AnalysisOrchestrator {
	public void analysisOrchestrator(String keySourcePath, String keyTargetPath) throws IOException {
		KeySorter keySorter = new KeySorter();
		KeyWriter keyWriter = new KeyWriter();
		String masterSetFileName = "masterSet.txt";
		String uniqueSetFileName = "uniqueSet.txt";
		
		
		HashSet<HashSet<String>> masterSet = keySorter.collectKeys(keySourcePath);
		
		String masterString = keyWriter.writeKeySets(masterSet);
		String newMasterTargetPath = keyTargetPath + "/" + masterSetFileName;
		saveFile(newMasterTargetPath, masterString);
		
		HashSet<String> uniqueSet = keySorter.collectUniqueKeys(masterSet);
		String uniqueString = keyWriter.writeUniqueSet(uniqueSet);
		String newUniqueTargetPath = keyTargetPath + "/" + uniqueSetFileName;
		saveFile(newUniqueTargetPath, uniqueString);
	}
}
