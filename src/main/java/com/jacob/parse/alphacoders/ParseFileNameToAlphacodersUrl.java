package com.jacob.parse.alphacoders;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToAlphacodersUrl {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(sb.indexOf("com") + 3, "/");
        sb.insert(sb.indexOf("i="), "?");
        return sb.toString();
    }
}
