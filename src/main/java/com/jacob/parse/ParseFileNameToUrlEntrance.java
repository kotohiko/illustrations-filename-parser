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
            [1]Pixiv
            [2]Pixiv illustrator ID
            [3]Twitter
            [4]yande
            [5]Miyoushe
            [6]Danbooru
            [7]Bilibili
            [8]Baidu Netdisk
            [9]Alphacoders
            [10]ニコニコ静画""";

    private ParseFileNameToUrlEntrance() {
    }

    private static void enterAccessCode() {
        System.out.print("Enter access code (1 — 11): ");
    }

    public static void interact() throws IOException {
        System.out.println(ENTRANCE_MESSAGE);
        enterAccessCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int themeCode = Integer.parseInt(line);
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
