package org.mario.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Utils {
	public static void saveFile(String newTargetPath, String savedText) throws FileNotFoundException {
		File file = new File(newTargetPath);
		PrintWriter out = new PrintWriter(file);
		out.println(savedText);
		out.close();
	}
}
