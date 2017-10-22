package com.pb.roy.utils;

import static com.pb.roy.utils.NumberFormatter.formatBigDecimal;
import static com.pb.roy.utils.NumberFormatter.formatBigDecimalToString;
import static com.pb.roy.utils.NumberFormatter.formatDoubleToString;

public class Main {
    public static void main(String[] args) {
        String strValue = "123.0";
        Double dblValue = new Double("123.0");

        System.out.println("formatBigDecimal(123.0 - 0) = " + formatBigDecimal(strValue,0));
        System.out.println("formatBigDecimal(123.0 - 1) = " + formatBigDecimal(strValue,1));
        System.out.println("formatBigDecimal(123.0 - 2) = " + formatBigDecimal(strValue,2));
        System.out.println("formatBigDecimal(123.0 - 3) = " + formatBigDecimal(strValue,3));
        System.out.println("formatBigDecimal(123.0 - 4) = " + formatBigDecimal(strValue,4));
        System.out.println("formatBigDecimal(dblValue-123.0 - 0) = " + formatBigDecimal(dblValue,0));
        System.out.println("formatBigDecimal(dblValue-123.0 - 1) = " + formatBigDecimal(dblValue,1));
        System.out.println("formatBigDecimal(dblValue-123.0 - 2) = " + formatBigDecimal(dblValue,2));
        System.out.println("formatBigDecimal(dblValue-123.0 - 3) = " + formatBigDecimal(dblValue,3));
        System.out.println("formatBigDecimal(dblValue-123.0 - 4) = " + formatBigDecimal(dblValue,4));
        System.out.println("formatBigDecimalToString(123.0 - 0) = " + formatBigDecimalToString(strValue,0));
        System.out.println("formatBigDecimalToString(123.0 - 1) = " + formatBigDecimalToString(strValue,1));
        System.out.println("formatBigDecimalToString(123.0 - 2) = " + formatBigDecimalToString(strValue,2));
        System.out.println("formatBigDecimalToString(123.0 - 3) = " + formatBigDecimalToString(strValue,3));
        System.out.println("formatBigDecimalToString(123.0 - 4) = " + formatBigDecimalToString(strValue,4));
        System.out.println("formatBigDecimalToString(dblValue - 123.0 - 0) = " + formatBigDecimalToString(dblValue,0));
        System.out.println("formatBigDecimalToString(dblValue - 123.0 - 1) = " + formatBigDecimalToString(dblValue,1));
        System.out.println("formatBigDecimalToString(dblValue - 123.0 - 2) = " + formatBigDecimalToString(dblValue,2));
        System.out.println("formatBigDecimalToString(dblValue - 123.0 - 3) = " + formatBigDecimalToString(dblValue,3));
        System.out.println("formatBigDecimalToString(dblValue - 123.0 - 4) = " + formatBigDecimalToString(dblValue,4));
        System.out.println("formatDoubleToString(123.0 - 0) = " + formatDoubleToString(strValue,0));
        System.out.println("formatDoubleToString(123.0 - 1) = " + formatDoubleToString(strValue,1));
        System.out.println("formatDoubleToString(123.0 - 2) = " + formatDoubleToString(strValue,2));
        System.out.println("formatDoubleToString(123.0 - 3) = " + formatDoubleToString(strValue,3));
        System.out.println("formatDoubleToString(123.0 - 4) = " + formatDoubleToString(strValue,4));
        System.out.println("formatDoubleToString(dblValue - 123.0 - 0) = " + formatDoubleToString(dblValue,0));
        System.out.println("formatDoubleToString(dblValue - 123.0 - 1) = " + formatDoubleToString(dblValue,1));
        System.out.println("formatDoubleToString(dblValue - 123.0 - 2) = " + formatDoubleToString(dblValue,2));
        System.out.println("formatDoubleToString(dblValue - 123.0 - 3) = " + formatDoubleToString(dblValue,3));
        System.out.println("formatDoubleToString(dblValue - 123.0 - 4) = " + formatDoubleToString(dblValue,4));

    }
}
