package com.pb.roy.utils;

import java.math.BigDecimal;

public class NumberFormatter{

    public NumberFormatter(){}

    public static BigDecimal formatBigDecimal(String number, int digits){
        //
        number = number.trim();
        int lenStr1 = number.length();
        if(number.contains(".")){
//            while(number.endsWith("0")){
//                number = number.substring(0,--lenStr1);
//            }
            while(number.charAt(--lenStr1) == '0' ){
                // nothing todo
            }
            number = number.substring(0,lenStr1+1);
            int lenStr2 = number.length();
            BigDecimal number1 = new BigDecimal(number);
            BigDecimal number2 = number1.movePointRight(digits);
            int lenStr3 = number.length();

            if(lenStr2 > lenStr3){
                return number1;
            }else{
                return number2.movePointLeft(digits);
            }
        }
        return new BigDecimal(number).movePointRight(digits).movePointLeft(digits);
    }
    public static BigDecimal formatBigDecimal(Double number, int digits){
        return formatBigDecimal(number.toString(),digits);
    }
    public static String formatBigDecimalToString(String number, int digits){
        return formatBigDecimal(number, digits).toString();
    }
    public static String formatBigDecimalToString(Double number, int digits){
        return formatBigDecimalToString(number.toString(), digits);
    }
    public static String formatDoubleToString(String number, int digits){
        return formatBigDecimalToString(number,digits);
    }
    public static String formatDoubleToString(Double number, int digits){
        return formatBigDecimalToString(number.toString(),digits);
    }
}
