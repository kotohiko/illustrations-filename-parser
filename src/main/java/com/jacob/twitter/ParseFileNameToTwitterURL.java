package com.jacob.twitter;

/**
 * 用于将Jacob保存的Twitter图片名称解析为图片资源URL的简单工具类
 *
 * @author Jacob Suen
 * @version 1.0
 */
public class ParseFileNameToTwitterURL {
    public static String parse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5, "://");
        sb.insert(19, "/");
        sb.insert(sb.indexOf("status"), "/");
        sb.insert(sb.indexOf("status") + 6, "/");
        return String.valueOf(sb);
    }
}
