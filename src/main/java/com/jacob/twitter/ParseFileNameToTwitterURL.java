package com.jacob.twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = parse(line);
            System.out.println(out);
        }
    }
}
