package org.mario.process.utils;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Utils {
	public static String readFile(String fullPath, Class inputClass) throws IOException {
		InputStream is = inputClass.getClassLoader().getResourceAsStream(fullPath);
		assert is != null;
		return IOUtils.toString(is, StandardCharsets.UTF_8);
	}
	
	public static void saveFile(String newTargetPath, String savedText) throws FileNotFoundException {
		File file = new File(newTargetPath);
		PrintWriter out = new PrintWriter(file);
		out.println(savedText);
		out.close();
	}
}
