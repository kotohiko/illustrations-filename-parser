package com.jacob.parse.yande;

public class ParseFileNameToYandeUrl {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(16, "/");
        sb.insert(21, "/");
        sb.insert(26, "/");
        return String.valueOf(sb);
    }
}
