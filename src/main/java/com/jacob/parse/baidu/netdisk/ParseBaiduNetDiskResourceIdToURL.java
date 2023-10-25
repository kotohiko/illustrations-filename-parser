package com.jacob.parse.baidu.netdisk;

/**
 * @author Jacob Suen
 */
public class ParseBaiduNetDiskResourceIdToURL {

    private ParseBaiduNetDiskResourceIdToURL() {
    }

    public static String parse(String str) {
        return "pan.baidu.com/s/" + str;
    }
}
