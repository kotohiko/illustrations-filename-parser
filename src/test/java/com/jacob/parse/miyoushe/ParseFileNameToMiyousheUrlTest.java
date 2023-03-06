package com.jacob.parse.miyoushe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToMiyousheUrlTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = ParseFileNameToMiyousheUrl.parse(line);
            System.out.println(out);
        }
    }
}
