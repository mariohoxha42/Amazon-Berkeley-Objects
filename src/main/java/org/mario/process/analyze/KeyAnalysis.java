package org.mario.process.analyze;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

import static org.mario.process.utils.Utils.readFile;

public class KeyAnalysis {
	Gson gson = new GsonBuilder().create();
	
	public HashSet<HashSet<String>> analyzeFile(String individualKeySourceFilePath, String individualKeySourceFileName) throws IOException {
		HashSet<HashSet<String>> masterSet = new HashSet<>();
		String fullPath = individualKeySourceFilePath + "/" + individualKeySourceFileName;
		String inputString = readFile(fullPath, this.getClass());
		HashSet<Map> mapList = gson.fromJson(inputString, HashSet.class);
		for (Map map : mapList) {
			HashSet<String> keySet = new HashSet<>();
			for (Object key : map.keySet()) {
				keySet.add(String.valueOf(key));
			}
			masterSet.add(keySet);
		}
		return masterSet;
	}
	
	public HashSet<HashSet<String>> analyzeFolder(String keySourcePath) throws IOException {
		HashSet<HashSet<String>> masterSet = new HashSet<>();
		
		File folder = new File(keySourcePath);
		File[] files = folder.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				String individualKeySourceFilePath = keySourcePath.replaceAll("src/.*/resources/", "");
				System.out.println("File is " + individualKeySourceFilePath + "/" + file.getName());
				HashSet<HashSet<String>> fileSet = analyzeFile(individualKeySourceFilePath, file.getName());
				masterSet.addAll(fileSet);
			} else if (file.isDirectory()) {
				String newFilePath = keySourcePath + "/" + file.getName();
				HashSet<HashSet<String>> directorySet = analyzeFolder(newFilePath);
				masterSet.addAll(directorySet);
			}
		}
		return masterSet;
	}
}