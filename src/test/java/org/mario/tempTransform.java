package org.mario;

import org.apache.spark.sql.SparkSession;
import org.mario.process.transform.Input;
import org.mario.process.transform.Output;

import java.io.IOException;
import java.util.List;

public class tempTransform {
//	@Test
	public void testInput() throws IOException {
		Input input = new Input();
		Output output = new Output();
		String inputFolder = "src/test/resources/generated-test-files";
		List<List> returnList =  input.readFiles(inputFolder);
		output.splitOutputs(returnList,inputFolder);
	}
	
//	@Test
	public void testSpark() {
		SparkSession spark = SparkSession.builder().master("local")
				.appName("Word Count")
//				.config("spark.some.config.option", "some-value")
				.getOrCreate();
	}
}
