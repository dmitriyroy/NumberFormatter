package com.pb.roy.utils;

import java.math.BigDecimal;

public class CustomNumberFormatter {

    public CustomNumberFormatter(){
    }


    public BigDecimal formatBigDecimal(String numberString, int digitals){
        //
        numberString = numberString.trim();
        int lenStr1 = numberString.length();
        if(numberString.contains(".")){
//            while(numberString.endsWith("0")){
//                numberString = numberString.substring(0,--lenStr1);
//            }
            while(numberString.charAt(--lenStr1) == '0' ){
                // nothing todo
            }
            numberString = numberString.substring(0,lenStr1+1);
            int lenStr2 = numberString.length();
            BigDecimal number = new BigDecimal(numberString);
            BigDecimal number2 = number.movePointRight(digitals);
            int lenStr3 = numberString.length();

            if(lenStr2 > lenStr3){
                return number;
            }else{
                return number2.movePointLeft(digitals);
            }
        }
        return new BigDecimal(numberString).movePointRight(digitals).movePointLeft(digitals);
    }


    public String formatBigDecimalToString(String numberString, int digitals){
        return formatBigDecimal(numberString, digitals).toString();
    }

    public Double formatDouble(String numberString, int digitals){
        return formatBigDecimal(numberString,digitals).doubleValue();
    }
    public String formatDoubleToString(String numberString, int digitals){
        return formatBigDecimalToString(numberString,digitals);
    }

    public BigDecimal formatBigDecimal(Double number, int digitals){
        return formatBigDecimal(number.toString(),digitals);
    }
    public String formatBigDecimalToString(Double number, int digitals){
        return formatBigDecimal(number, digitals).toString();
    }
    public Double formatDouble(Double number, int digitals){
        return formatDouble(number.toString(),digitals);
    }
    public String formatDoubleToString(Double number, int digitals){
        return formatDouble(number,digitals).toString();
    }
}

