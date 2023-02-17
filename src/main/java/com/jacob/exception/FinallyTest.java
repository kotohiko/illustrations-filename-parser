package com.jacob.exception;

/**
 * @author Jacob Suen
 */
public class FinallyTest {

    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
        int b = 20;
        try {
            System.out.println("try block");
            // b自增了80，但没有返回，而是继续去执行finally
            return b += 80;
        } // 未遇到异常，catch不触发
        catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
            if (b > 25) {
                System.out.println("b > 25, b = " + b);
            }
        }
        return b;
    }
}

