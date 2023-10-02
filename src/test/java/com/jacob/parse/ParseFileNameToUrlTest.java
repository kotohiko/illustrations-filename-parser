package com.jacob.parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToUrlTest {
    public static void main(String[] args) throws IOException {
        String msg = """
                Choose your theme:
                    [1]Pixiv
                    [2]Twitter
                    [3]yande
                    [4]Miyoushe
                    [5]Danbooru
                    [6]Bilibili
                    [7]Baidu Netdisk
                    [8]Alphacoders
                Or maybe you wanna other ways:
                    [9]Common
                    [10]Pixiv illustrator ID""";
        System.out.println(msg);
        System.out.print("Enter access code (1~10): ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int themeCode = Integer.parseInt(line);
            System.out.print("Enter filename: ");
            line = in.readLine();
            String filename = line;
            String out = CommonEnter.parseFileName(themeCode, filename);
            System.out.println(out);
        }
    }
}
