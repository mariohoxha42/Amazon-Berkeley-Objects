package org.mario;

import org.apache.spark.sql.SparkSession;
import org.mario.process.transform.Input;

import java.io.IOException;
import java.util.List;

public class tempTransform {
//	@Test
	public void testInput() throws IOException {
		SparkSession spark = SparkSession.builder().master("local").appName("Test Input").getOrCreate();
		Input input = new Input();
		String inputFolder = "src/test/resources/generated-test-files";
		List<List> returnList =  input.readFiles(spark, inputFolder);
		spark.close();
	}
}
