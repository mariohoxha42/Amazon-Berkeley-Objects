package org.mario.analysis;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

    public void saveKeyFiles(String savedText, String keyTargetPath, String keyTargetFileName) throws IOException {
        String fullPath = keyTargetPath + "/" + keyTargetFileName;
        File file = new File(fullPath);
        PrintWriter out = new PrintWriter(file);
        out.println(savedText);
        out.close();
    }
}