package com.pb.roy.utils;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CustomNumberFormatterTest {

    @Test
    public void formatBigDecimalTest0_0(){
        assertEquals(new BigDecimal("1234"),new CustomNumberFormatter().formatBigDecimal("1234",0));
    }
    @Test
    public void formatBigDecimalTest0_1(){
        assertEquals(new BigDecimal("1234"),new CustomNumberFormatter().formatBigDecimal("1234.0",0));
    }
    @Test
    public void formatBigDecimalTest0_2(){
        assertEquals(new BigDecimal("1234"),new CustomNumberFormatter().formatBigDecimal("1234.00",0));
    }
    @Test
    public void formatBigDecimalTest2_0(){
        assertEquals(new BigDecimal("1234.00"),new CustomNumberFormatter().formatBigDecimal("1234",2));
    }
    @Test
    public void formatBigDecimalTest2_1(){
        assertEquals(new BigDecimal("1234.00"),new CustomNumberFormatter().formatBigDecimal("1234.0",2));
    }
    @Test
    public void formatBigDecimalTest2_2(){
        assertEquals(new BigDecimal("1234.00"),new CustomNumberFormatter().formatBigDecimal("1234.00",2));
    }
    @Test
    public void formatBigDecimalTest2_3(){
        assertEquals(new BigDecimal("1234.00"),new CustomNumberFormatter().formatBigDecimal("1234.000",2));
    }
    @Test
    public void formatBigDecimalTest3_0(){
        assertEquals(new BigDecimal("1234.000"),new CustomNumberFormatter().formatBigDecimal("1234",3));
    }
    @Test
    public void formatBigDecimalTest3_1(){
        assertEquals(new BigDecimal("1234.000"),new CustomNumberFormatter().formatBigDecimal("1234.0",3));
    }
    @Test
    public void formatBigDecimalTest3_2(){
        assertEquals(new BigDecimal("1234.000"),new CustomNumberFormatter().formatBigDecimal("1234.00",3));
    }
    @Test
    public void formatBigDecimalTest3_3(){
        assertEquals(new BigDecimal("1234.000"),new CustomNumberFormatter().formatBigDecimal("1234.000",3));
    }
    @Test
    public void formatBigDecimalTest3_4(){
        assertEquals(new BigDecimal("1234.000"),new CustomNumberFormatter().formatBigDecimal("1234.0000",3));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatBigDecimalToStringTest0_0(){
        assertEquals("1234",new CustomNumberFormatter().formatBigDecimalToString("1234",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_1(){
        assertEquals("1234",new CustomNumberFormatter().formatBigDecimalToString("1234.0",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_2(){
        assertEquals("1234",new CustomNumberFormatter().formatBigDecimalToString("1234.00",0));
    }
    @Test
    public void formatBigDecimalToStringTest2_0(){
        assertEquals("1234.00",new CustomNumberFormatter().formatBigDecimalToString("1234",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_1(){
        assertEquals("1234.00",new CustomNumberFormatter().formatBigDecimalToString("1234.0",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_2(){
        assertEquals("1234.00",new CustomNumberFormatter().formatBigDecimalToString("1234.00",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_3(){
        assertEquals("1234.00",new CustomNumberFormatter().formatBigDecimalToString("1234.000",2));
    }
    @Test
    public void formatBigDecimalToStringTest3_0(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_1(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234.0",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_2(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234.00",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_3(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234.000",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_4(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234.0000",3));
    }
    //////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatDoubleTest0_0(){
        assertEquals(new Double("1234"),new CustomNumberFormatter().formatDouble("1234",0));
    }
    @Test
    public void formatDoubleTest0_1(){
        assertEquals(new Double("1234"),new CustomNumberFormatter().formatDouble("1234.0",0));
    }
    @Test
    public void formatDoubleTest0_2(){
        assertEquals(new Double("1234"),new CustomNumberFormatter().formatDouble("1234.00",0));
    }
    @Test
    public void formatDoubleTest2_0(){
        assertEquals(new Double("1234.00"),new CustomNumberFormatter().formatDouble("1234",2));
    }
    @Test
    public void formatDoubleTest2_1(){
        assertEquals(new Double("1234.00"),new CustomNumberFormatter().formatDouble("1234.0",2));
    }
    @Test
    public void formatDoubleTest2_2(){
        assertEquals(new Double("1234.00"),new CustomNumberFormatter().formatDouble("1234.00",2));
    }
    @Test
    public void formatDoubleTest2_3(){
        assertEquals(new Double("1234.00"),new CustomNumberFormatter().formatDouble("1234.000",2));
    }
    @Test
    public void formatDoubleTest3_0(){
        assertEquals(new Double("1234.000"),new CustomNumberFormatter().formatDouble("1234",3));
    }
    @Test
    public void formatDoubleTest3_1(){
        assertEquals(new Double("1234.000"),new CustomNumberFormatter().formatDouble("1234.0",3));
    }
    @Test
    public void formatDoubleTest3_2(){
        assertEquals(new Double("1234.000"),new CustomNumberFormatter().formatDouble("1234.00",3));
    }
    @Test
    public void formatDoubleTest3_3(){
        assertEquals(new Double("1234.000"),new CustomNumberFormatter().formatDouble("1234.000",3));
    }
    @Test
    public void formatDoubleTest3_4(){
        assertEquals(new Double("1234.000"),new CustomNumberFormatter().formatDouble("1234.0000",3));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatDoubleToStringTest0_0(){
        assertEquals("1234",new CustomNumberFormatter().formatDoubleToString("1234",0));
    }
    @Test
    public void formatDoubleToStringTest0_1(){
        assertEquals("1234",new CustomNumberFormatter().formatDoubleToString("1234.0",0));
    }
    @Test
    public void formatDoubleToStringTest0_2(){
        assertEquals("1234",new CustomNumberFormatter().formatDoubleToString("1234.00",0));
    }
    @Test
    public void formatDoubleToStringTest2_0(){
        assertEquals("1234.00",new CustomNumberFormatter().formatDoubleToString("1234",2));
    }
    @Test
    public void formatDoubleToStringTest2_1(){
        assertEquals("1234.00",new CustomNumberFormatter().formatDoubleToString("1234.0",2));
    }
    @Test
    public void formatDoubleToStringTest2_2(){
        assertEquals("1234.00",new CustomNumberFormatter().formatDoubleToString("1234.00",2));
    }
    @Test
    public void formatDoubleToStringTest2_3(){
        assertEquals("1234.00",new CustomNumberFormatter().formatDoubleToString("1234.000",2));
    }
    @Test
    public void formatDoubleToStringTest3_0(){
        assertEquals("1234.000",new CustomNumberFormatter().formatDoubleToString("1234",3));
    }
    @Test
    public void formatDoubleToStringTest3_1(){
        assertEquals("1234.000",new CustomNumberFormatter().formatDoubleToString("1234.0",3));
    }
    @Test
    public void formatDoubleToStringTest3_2(){
        assertEquals("1234.000",new CustomNumberFormatter().formatDoubleToString("1234.00",3));
    }
    @Test
    public void formatDoubleToStringTest3_3(){
        assertEquals("1234.000",new CustomNumberFormatter().formatDoubleToString("1234.000",3));
    }
    @Test
    public void formatDoubleToStringTest3_4(){
        assertEquals("1234.000",new CustomNumberFormatter().formatBigDecimalToString("1234.0000",3));
    }
}
