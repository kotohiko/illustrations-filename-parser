package com.jacob.calculator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算两个日期的天数差
 */
public class DateDiffCalculator {
    public static int dateDiffCalculator(String fromDate, String toDate) {
        LocalDate from = LocalDate.parse(fromDate);
        LocalDate to = LocalDate.parse(toDate);
        return (int) ChronoUnit.DAYS.between(from, to);
    }
}