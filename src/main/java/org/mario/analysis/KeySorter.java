package org.mario.analysis;

import java.io.IOException;
import java.util.HashSet;

public class KeySorter {
	public HashSet<HashSet<String>> collectKeys(String keySourcePath) throws IOException {
		KeyAnalysis keyAnalysis = new KeyAnalysis();
		return keyAnalysis.analyzeFolder(keySourcePath);
	}
	
	public HashSet<String> collectUniqueKeys(HashSet<HashSet<String>> masterSet) {
		HashSet<String> uniqueSet = new HashSet<>();
		for (HashSet<String> innerSet : masterSet) {
			uniqueSet.addAll(innerSet);
		}
		return uniqueSet;
	}
}