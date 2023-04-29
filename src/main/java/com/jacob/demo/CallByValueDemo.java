package com.jacob.demo;

public class CallByValueDemo {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        System.out.println(a + " " + b);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
