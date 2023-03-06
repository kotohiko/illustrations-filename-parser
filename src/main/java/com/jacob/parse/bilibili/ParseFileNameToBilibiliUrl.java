package com.jacob.parse.bilibili;

/**
 * @author Jacob Suen
 */
public class ParseFileNameToBilibiliUrl {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(24, "/");
        sb.insert(sb.indexOf("opus") + 4, "/");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.delete(sb2.indexOf("spm_id_from"), sb2.length());
        return sb2.toString();
    }
}
