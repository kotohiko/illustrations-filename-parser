package com.jacob;

import com.jacob.parse.ParseFileNameToUrlEntrance;

import java.io.IOException;

/**
 * Startup class of the project.
 *
 * @author Jacob Suen
 * @since Oct 25, 2023
 */
public final class ParserApplication {
    public static void main(String[] args) throws IOException {
        ParseFileNameToUrlEntrance.interact();
    }
}
