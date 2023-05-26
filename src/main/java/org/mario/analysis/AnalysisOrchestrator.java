package org.mario.analysis;

import java.io.IOException;
import java.util.HashSet;

public class AnalysisOrchestrator {
    public void analysisOrchestrator(String keySourcePath, String keyTargetPath) throws IOException {
        KeySorter keySorter = new KeySorter();
        KeyWriter keyWriter = new KeyWriter();

        HashSet<HashSet<String>> masterSet= keySorter.collectKeys(keySourcePath);

        String masterString = keyWriter.writeKeySets(masterSet);
        keyWriter.saveKeyFiles(masterString, keyTargetPath, "masterSet.txt");

        HashSet<String> uniqueSet = keySorter.collectUniqueKeys(masterSet);
        String uniqueString = keyWriter.writeUniqueSet(uniqueSet);
        keyWriter.saveKeyFiles(uniqueString, keyTargetPath, "uniqueSet.txt");
    }
}
