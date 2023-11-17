package com.jacob.parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Entrance of Parsing Filename to URL.
 *
 * @author Jacob Suen
 * @since Oct 2, 2023
 */
public final class ParseFileNameToUrlEntrance {

    private static final String ENTRANCE_MESSAGE = """
            Choose your entrance:
            [a]lphacoders
            [bi]libili
            [ba]idu Netdisk
            [d]anbooru
            [m]iyoushe
            [n]iconico ニコニコ静画
            [p]ixiv
            [t]witter
            [ya]nde
            [yo]utube""";

    /**
     * Don't let anyone instantiate this class
     */
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
            String siteCode = line;
            String sideCodeValidation = CommonEnter.parseSiteCode(siteCode);
            if (sideCodeValidation == null) {
                System.out.println("Access code invalid, please try again.");
                System.out.println("********************************END LINE********************************");
                interact();
            } else {
                System.out.print("Enter filename: ");
                line = in.readLine();
                String filename = line;
                String out = CommonEnter.parseFileName(sideCodeValidation, filename);
                System.out.println(out);
                System.out.println("********************************END LINE********************************");
                enterAccessCode();
            }
        }
    }
}
