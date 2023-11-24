package com.jacob;

import com.jacob.parse.ParsingFileNameToUrlEntrance;

import java.io.IOException;

/**
 * Startup class of the project.
 *
 * @author Jacob Suen
 * @since Oct 25, 2023
 */
public final class ParserApplication {
    public static void main(String[] args) throws IOException {
        ParsingFileNameToUrlEntrance.interact();
    }
}
