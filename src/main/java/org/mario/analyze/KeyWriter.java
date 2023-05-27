package org.mario.analyze;

import java.util.HashSet;

public class KeyWriter {
	public String writeKeySets(HashSet<HashSet<String>> masterSet) {
		StringBuilder finalLine = new StringBuilder();
		for (HashSet<String> innerSet : masterSet) {
			if (finalLine.length() > 0) {
				finalLine.append(System.getProperty("line.separator"));
				finalLine.append(innerSet);
			} else {
				finalLine.append(innerSet);
			}
		}
		return finalLine.toString();
	}
	
	public String writeUniqueSet(HashSet<String> uniqueSet) {
		StringBuilder finalLine = new StringBuilder();
		for (String key : uniqueSet) {
			if (finalLine.length() > 0) {
				finalLine.append(System.getProperty("line.separator"));
				finalLine.append(key);
			} else {
				finalLine.append(key);
			}
		}
		return finalLine.toString();
	}
}