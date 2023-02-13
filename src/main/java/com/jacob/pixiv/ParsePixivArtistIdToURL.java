package com.jacob.pixiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 * @version 1.0
 */
public class ParsePixivArtistIdToURL {

    public static String parse(String str) {
        if (str.contains("_")) {
            str = str.substring(0, str.indexOf('_'));
        }
        return "https://www.pixiv.net/users/" + str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = parse(line);
            System.out.println(out);
        }
    }
}
