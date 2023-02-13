package com.jacob.pixiv;

/**
 * @author Jacob Suen
 * @version 1.0
 */
public class ParsePixivIllustrationIdToURL {
    public static String parse(String str) {
        if (str.contains("_")) {
            str = str.substring(0, str.indexOf('_'));
        }
        return "https://www.pixiv.net/artworks/" + str;
    }
}
