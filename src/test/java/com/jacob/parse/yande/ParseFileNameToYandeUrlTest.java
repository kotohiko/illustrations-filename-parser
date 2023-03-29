package com.jacob.parse.yande;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseFileNameToYandeUrlTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = ParseFileNameToYandeUrl.parse(line);
            System.out.println(out);
        }
    }
}
