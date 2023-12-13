package com.jacob;

import com.jacob.parse.ParsingFileNameToUrlEntrance;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Startup class of the project.
 *
 * @author Jacob Suen
 * @since Oct 25, 2023
 */
public final class ParserApplication {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ParsingFileNameToUrlEntrance.interact();
    }
}
