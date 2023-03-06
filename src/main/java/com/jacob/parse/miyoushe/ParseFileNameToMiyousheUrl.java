package com.jacob.parse.miyoushe;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToMiyousheUrl {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(24, "/");
        sb.insert(sb.indexOf("ys") + 2, "/");
        sb.insert(sb.indexOf("article") + 7, "/");
        return sb.toString();
    }
}
