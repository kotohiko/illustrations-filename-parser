package com.jacob.parse.entrance;

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

    private static final String START_LINE
            = "------------------------------------------START LINE------------------------------------------";
    private static final String END_LINE
            = "-------------------------------------------END LINE-------------------------------------------\n";

    /**
     * Don't let anyone instantiate this class
     */
    private ParsingFileNameToUrlEntrance() {
    }

    /**
     * 交互逻辑
     */
    public static void getFilename() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        startLinePrint();
        System.out.print("Please enter your filename: ");
        while (true) {
            try {
                if ((line = in.readLine()) == null) {
                    break;
                }
            } catch (IOException e) {
                System.out.println("I/O exception happened.");
                getFilename();
            }
            String retUrl = CommonEnter.parseFileName(line);
            if (retUrl.isBlank()) {
                System.out.println("Url is blank, please check if there are any errors in the input content.");
                endLinePrint();
                getFilename();
            } else {
                openUriByBrowser(retUrl);
                endLinePrint();
                startLinePrint();
                System.out.print("Please enter your filename: ");
            }
        }
    }

    /**
     * 支持解析以后直接通过浏览器来打开
     */
    private static void openUriByBrowser(String out) {
        System.out.println("Parsed successfully: " + out + ","
                + " your default browser will be opened automatically and heading to this url...");
        Desktop desktop = Desktop.getDesktop();
        try {
            URI uri = new URI(out);
            desktop.browse(uri);
        } catch (URISyntaxException | IOException e) {
            System.out.println("An url syntax error happened, or url is null," +
                    " please check if there are any errors in the input content.");
            getFilename();
        }
    }

    private static void startLinePrint() {
        System.out.println(START_LINE);
    }

    private static void endLinePrint() {
        System.out.println(END_LINE);
    }
}
