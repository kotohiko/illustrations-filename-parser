package com.jacob.parse.pixiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 * @version 1.0
 */
public class ParsePixivArtistIdToUrlTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = ParsePixivArtistIdToUrl.parse(line);
            System.out.println(out);
        }
    }
}
