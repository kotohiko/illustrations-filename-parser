package com.jacob.chars;

import java.util.Arrays;

public class CharAndUnicodeDemo {
    public static void main(String[] args) {
        String hello = "🤣😊😎";
        int [] codePoints = hello.codePoints().toArray();
        System.out.println(Arrays.toString(codePoints));
    }
}
