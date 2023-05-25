package org.mario.extraction;

import org.testng.annotations.Test;

import java.io.IOException;

public class ParserTest {

    @Test
    public void parseFileTest() throws IOException {
        Parser parser = new Parser();
        parser.parseFile("listings", "listings_test.json");
    }

    @Test
    public void parseFolderTest() throws IOException {
        Parser parser = new Parser();
        parser.parseFolder("src/test/resources/listings");
    }
}