package com.jacob.parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToUrlEntrance {

    private static final String ENTRANCE_MESSAGE = """
            Choose your entrance:
            [p]ixiv
            [t]witter
            [y]ande
            [m]iyoushe
            [d]anbooru
            [b]ilibili
            [ba]idu Netdisk
            [a]lphacoders
            [n]iconico ニコニコ静画""";

    private ParseFileNameToUrlEntrance() {
    }

    private static void enterAccessCode() {
        System.out.print("Enter access code (e.g. p): ");
    }

    public static void interact() throws IOException {
        System.out.println(ENTRANCE_MESSAGE);
        enterAccessCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String themeCode = line;
            System.out.print("Enter filename: ");
            line = in.readLine();
            String filename = line;
            String out = CommonEnter.parseFileName(themeCode, filename);
            System.out.println(out);
            System.out.println("==================END LINE====================");
            enterAccessCode();
        }
    }
}
