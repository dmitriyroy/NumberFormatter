package com.pb.roy.utils;

public class Main {
    public static void main(String[] args) {
        String strValue = "123.0";
        CustomNumberFormatter nf = new CustomNumberFormatter();

        System.out.println("nf.formatBigDecimal(123.0 - 0) = " + nf.formatBigDecimal(strValue,0));
        System.out.println("nf.formatBigDecimal(123.0 - 1) = " + nf.formatBigDecimal(strValue,1));
        System.out.println("nf.formatBigDecimal(123.0 - 2) = " + nf.formatBigDecimal(strValue,2));
        System.out.println("nf.formatBigDecimal(123.0 - 3) = " + nf.formatBigDecimal(strValue,3));
        System.out.println("nf.formatBigDecimal(123.0 - 4) = " + nf.formatBigDecimal(strValue,4));
        System.out.println("nf.formatBigDecimalToString(123.0 - 0) = " + nf.formatBigDecimalToString(strValue,0));
        System.out.println("nf.formatBigDecimalToString(123.0 - 1) = " + nf.formatBigDecimalToString(strValue,1));
        System.out.println("nf.formatBigDecimalToString(123.0 - 2) = " + nf.formatBigDecimalToString(strValue,2));
        System.out.println("nf.formatBigDecimalToString(123.0 - 3) = " + nf.formatBigDecimalToString(strValue,3));
        System.out.println("nf.formatBigDecimalToString(123.0 - 4) = " + nf.formatBigDecimalToString(strValue,4));
        System.out.println("nf.formatDouble(123.0 - 0) = " + nf.formatDouble(strValue,0));
        System.out.println("nf.formatDouble(123.0 - 1) = " + nf.formatDouble(strValue,1));
        System.out.println("nf.formatDouble(123.0 - 2) = " + nf.formatDouble(strValue,2));
        System.out.println("nf.formatDouble(123.0 - 3) = " + nf.formatDouble(strValue,3));
        System.out.println("nf.formatDouble(123.0 - 4) = " + nf.formatDouble(strValue,4));

    }
}
