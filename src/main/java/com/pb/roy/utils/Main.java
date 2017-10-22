package com.pb.roy.utils;

public class Main {
    public static void main(String[] args) {
        String strValue = "123.0";
        Double dblValue = new Double("123.0");
        NumberFormatter nf = new NumberFormatter();

        System.out.println("nf.formatBigDecimal(123.0 - 0) = " + nf.formatBigDecimal(strValue,0));
        System.out.println("nf.formatBigDecimal(123.0 - 1) = " + nf.formatBigDecimal(strValue,1));
        System.out.println("nf.formatBigDecimal(123.0 - 2) = " + nf.formatBigDecimal(strValue,2));
        System.out.println("nf.formatBigDecimal(123.0 - 3) = " + nf.formatBigDecimal(strValue,3));
        System.out.println("nf.formatBigDecimal(123.0 - 4) = " + nf.formatBigDecimal(strValue,4));
        System.out.println("nf.formatBigDecimal(dblValue-123.0 - 0) = " + nf.formatBigDecimal(dblValue,0));
        System.out.println("nf.formatBigDecimal(dblValue-123.0 - 1) = " + nf.formatBigDecimal(dblValue,1));
        System.out.println("nf.formatBigDecimal(dblValue-123.0 - 2) = " + nf.formatBigDecimal(dblValue,2));
        System.out.println("nf.formatBigDecimal(dblValue-123.0 - 3) = " + nf.formatBigDecimal(dblValue,3));
        System.out.println("nf.formatBigDecimal(dblValue-123.0 - 4) = " + nf.formatBigDecimal(dblValue,4));
        System.out.println("nf.formatBigDecimalToString(123.0 - 0) = " + nf.formatBigDecimalToString(strValue,0));
        System.out.println("nf.formatBigDecimalToString(123.0 - 1) = " + nf.formatBigDecimalToString(strValue,1));
        System.out.println("nf.formatBigDecimalToString(123.0 - 2) = " + nf.formatBigDecimalToString(strValue,2));
        System.out.println("nf.formatBigDecimalToString(123.0 - 3) = " + nf.formatBigDecimalToString(strValue,3));
        System.out.println("nf.formatBigDecimalToString(123.0 - 4) = " + nf.formatBigDecimalToString(strValue,4));
        System.out.println("nf.formatBigDecimalToString(dblValue - 123.0 - 0) = " + nf.formatBigDecimalToString(dblValue,0));
        System.out.println("nf.formatBigDecimalToString(dblValue - 123.0 - 1) = " + nf.formatBigDecimalToString(dblValue,1));
        System.out.println("nf.formatBigDecimalToString(dblValue - 123.0 - 2) = " + nf.formatBigDecimalToString(dblValue,2));
        System.out.println("nf.formatBigDecimalToString(dblValue - 123.0 - 3) = " + nf.formatBigDecimalToString(dblValue,3));
        System.out.println("nf.formatBigDecimalToString(dblValue - 123.0 - 4) = " + nf.formatBigDecimalToString(dblValue,4));
        System.out.println("nf.formatDoubleToString(123.0 - 0) = " + nf.formatDoubleToString(strValue,0));
        System.out.println("nf.formatDoubleToString(123.0 - 1) = " + nf.formatDoubleToString(strValue,1));
        System.out.println("nf.formatDoubleToString(123.0 - 2) = " + nf.formatDoubleToString(strValue,2));
        System.out.println("nf.formatDoubleToString(123.0 - 3) = " + nf.formatDoubleToString(strValue,3));
        System.out.println("nf.formatDoubleToString(123.0 - 4) = " + nf.formatDoubleToString(strValue,4));
        System.out.println("nf.formatDoubleToString(dblValue - 123.0 - 0) = " + nf.formatDoubleToString(dblValue,0));
        System.out.println("nf.formatDoubleToString(dblValue - 123.0 - 1) = " + nf.formatDoubleToString(dblValue,1));
        System.out.println("nf.formatDoubleToString(dblValue - 123.0 - 2) = " + nf.formatDoubleToString(dblValue,2));
        System.out.println("nf.formatDoubleToString(dblValue - 123.0 - 3) = " + nf.formatDoubleToString(dblValue,3));
        System.out.println("nf.formatDoubleToString(dblValue - 123.0 - 4) = " + nf.formatDoubleToString(dblValue,4));

    }
}
