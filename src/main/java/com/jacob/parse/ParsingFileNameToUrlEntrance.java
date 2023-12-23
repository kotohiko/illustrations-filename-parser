package com.jacob.parse;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Entrance of parsing filename to URL.
 *
 * @author Jacob Suen
 * @since Oct 2, 2023
 */
public final class ParsingFileNameToUrlEntrance {

    private static final String END_LINE = "********************************END LINE********************************";

    private static final String ENTRANCE_MESSAGE = """
            Choose your entrance:
            [a]lphacoders
            [ba]idu Netdisk
            [bi]libili
            [bi]libili [v]ideos (please enter "biv" if by this access)
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
    private ParsingFileNameToUrlEntrance() {
    }

    private static void enterAccessCode() {
        System.out.print("Enter access code (e.g. p): ");
    }

    private static void endLinePrint() {
        System.out.println(END_LINE);
    }

    /**
     * Interaction logic.
     *
     * @throws IOException I/O exception
     */
    public static void interact() throws IOException {
        System.out.println(ENTRANCE_MESSAGE);
        enterAccessCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String siteCode = line;
            String sideCodeValidation = CommonEnter.parseSiteCode(siteCode);
            if (sideCodeValidation == null || sideCodeValidation.isBlank()) {
                System.out.println("Access code invalid, please try again.");
                endLinePrint();
                interact();
            } else {
                System.out.print("Enter filename: ");
                line = in.readLine();
                String filename = line;
                String out = CommonEnter.parseFileName(sideCodeValidation, filename);
                System.out.println(out);
                openUriByBrowser(out);
                endLinePrint();
                enterAccessCode();
            }
        }
    }

    /**
     * 支持解析以后直接通过浏览器来打开
     */
    private static void openUriByBrowser(String out) {
        Desktop desktop = Desktop.getDesktop();
        URI uri;
        try {
            uri = new URI(out);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
