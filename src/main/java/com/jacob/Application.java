package com.jacob;

import com.jacob.parse.ParseFileNameToUrlEntrance;

import java.io.IOException;

/**
 * Startup class of the project.
 *
 * @since Oct 25, 2023
 * @author Jacob Suen
 */
public final class Application {
    public static void main(String[] args) throws IOException {
        ParseFileNameToUrlEntrance.interact();
    }
}
