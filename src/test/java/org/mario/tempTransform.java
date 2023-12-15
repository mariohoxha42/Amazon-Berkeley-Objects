package org.mario;

import org.mario.process.transform.Input;
import org.mario.process.transform.Output;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class tempTransform {
//	@Test
//	public void testSpark() {
//		SparkSession sparkSession = SparkSession.builder()
//				.master("local")
//				.appName("Spark Session Example")
//				.getOrCreate();
//	}
//
	@Test
	public void testInput() throws IOException {
		Input input = new Input();
		Output output = new Output();
		String inputFolder = "src/test/resources/generated-test-files";
		List<List> returnList =  input.readFiles(inputFolder);
		output.splitOutputs(returnList,inputFolder);
	}
}