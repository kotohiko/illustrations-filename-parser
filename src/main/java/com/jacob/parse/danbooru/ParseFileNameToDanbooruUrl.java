package com.jacob.parse.danbooru;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToDanbooruUrl {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5,"://");
        sb.insert(26,"/");
        sb.insert(32,"/");
        return String.valueOf(sb);
    }
}
