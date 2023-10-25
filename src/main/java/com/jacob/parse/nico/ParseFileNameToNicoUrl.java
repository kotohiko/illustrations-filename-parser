package com.jacob.parse.nico;

public class ParseFileNameToNicoUrl {
    public static String parse(String str) {
        return "https://seiga.nicovideo.jp/seiga/" + str;
    }
}
