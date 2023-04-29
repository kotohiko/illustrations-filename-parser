package com.jacob.demo;

public class CharDemo {
    public static void main(String[] args) {
        String a = "锄禾日当午";
        String b = "🫤";
        System.out.println(a.charAt(2));
        System.out.println(b.codePointCount(0,b.length()));
    }
}
