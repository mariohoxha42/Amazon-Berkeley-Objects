package org.mario.extractor;

import org.testng.annotations.Test;

import java.io.IOException;

public class ParserTest {

    @Test
    public void parseFileTest() throws IOException {
        Parser parser = new Parser();
        parser.parseFile("listings/", "listings_test.json");
    }
}