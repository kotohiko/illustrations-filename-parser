package com.jacob.calculator;

import java.util.Scanner;

public class DateDiffCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入起始日期（yyyy-mm-dd）：");
        String fromDate = input.next();
        System.out.print("请输入截止日期（yyyy-mm-dd）：");
        String toDate = input.next();
        System.out.println(DateDiffCalculator.dateDiffCalculator(fromDate,toDate));
    }
}
