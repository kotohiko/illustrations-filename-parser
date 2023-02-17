package com.jacob.baidu.netdisk;

/**
 * @author Jacob Suen
 */
public class ParseBaiduNetDiskResourceIdToURL {
    public static String parse(String str) {
        return "pan.baidu.com/s/" + str;
    }
}
