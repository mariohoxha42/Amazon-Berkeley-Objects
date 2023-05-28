package org.mario;

import org.mario.process.transform.Input;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class tempTransform {
	@Test
	public void testInput() throws IOException {
		Input input = new Input();
		String inputFolder = "src/test/resources/generated-test-files";
		List<List> returnList =  input.readFiles(inputFolder);
	}
}
