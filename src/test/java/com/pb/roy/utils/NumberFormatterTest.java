package com.pb.roy.utils;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static com.pb.roy.utils.NumberFormatter.formatBigDecimal;
import static com.pb.roy.utils.NumberFormatter.formatBigDecimalToString;
import static com.pb.roy.utils.NumberFormatter.formatDoubleToString;
import static org.junit.Assert.assertEquals;

public class NumberFormatterTest {

    @Test
    public void formatBigDecimalTest0_0(){
        assertEquals(new BigDecimal("1234"),formatBigDecimal("1234",0));
    }
    @Test
    public void formatBigDecimalTest0_1(){
        assertEquals(new BigDecimal("1234"),formatBigDecimal("1234.0",0));
    }
    @Test
    public void formatBigDecimalTest0_2(){
        assertEquals(new BigDecimal("1234"),formatBigDecimal("1234.00",0));
    }
    @Test
    public void formatBigDecimalTest2_0(){
        assertEquals(new BigDecimal("1234.00"),formatBigDecimal("1234",2));
    }
    @Test
    public void formatBigDecimalTest2_1(){
        assertEquals(new BigDecimal("1234.00"),formatBigDecimal("1234.0",2));
    }
    @Test
    public void formatBigDecimalTest2_2(){
        assertEquals(new BigDecimal("1234.00"),formatBigDecimal("1234.00",2));
    }
    @Test
    public void formatBigDecimalTest2_3(){
        assertEquals(new BigDecimal("1234.00"),formatBigDecimal("1234.000",2));
    }
    @Test
    public void formatBigDecimalTest3_0(){
        assertEquals(new BigDecimal("1234.000"),formatBigDecimal("1234",3));
    }
    @Test
    public void formatBigDecimalTest3_1(){
        assertEquals(new BigDecimal("1234.000"),formatBigDecimal("1234.0",3));
    }
    @Test
    public void formatBigDecimalTest3_2(){
        assertEquals(new BigDecimal("1234.000"),formatBigDecimal("1234.00",3));
    }
    @Test
    public void formatBigDecimalTest3_3(){
        assertEquals(new BigDecimal("1234.000"),formatBigDecimal("1234.000",3));
    }
    @Test
    public void formatBigDecimalTest3_4(){
        assertEquals(new BigDecimal("1234.000"),formatBigDecimal("1234.0000",3));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatBigDecimalToStringTest0_0(){
        assertEquals("1234",formatBigDecimalToString("1234",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_1(){
        assertEquals("1234",formatBigDecimalToString("1234.0",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_2(){
        assertEquals("1234",formatBigDecimalToString("1234.00",0));
    }
    @Test
    public void formatBigDecimalToStringTest2_0(){
        assertEquals("1234.00",formatBigDecimalToString("1234",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_1(){
        assertEquals("1234.00",formatBigDecimalToString("1234.0",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_2(){
        assertEquals("1234.00",formatBigDecimalToString("1234.00",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_3(){
        assertEquals("1234.00",formatBigDecimalToString("1234.000",2));
    }
    @Test
    public void formatBigDecimalToStringTest3_0(){
        assertEquals("1234.000",formatBigDecimalToString("1234",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_1(){
        assertEquals("1234.000",formatBigDecimalToString("1234.0",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_2(){
        assertEquals("1234.000",formatBigDecimalToString("1234.00",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_3(){
        assertEquals("1234.000",formatBigDecimalToString("1234.000",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_4(){
        assertEquals("1234.000",formatBigDecimalToString("1234.0000",3));
    }
    //////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatDoubleToStringTest0_0(){
        assertEquals("1234",formatDoubleToString("1234",0));
    }
    @Test
    public void formatDoubleToStringTest0_1(){
        assertEquals("1234",formatDoubleToString("1234.0",0));
    }
    @Test
    public void formatDoubleToStringTest0_2(){
        assertEquals("1234",formatDoubleToString("1234.00",0));
    }
    @Test
    public void formatDoubleToStringTest2_0(){
        assertEquals("1234.00",formatDoubleToString("1234",2));
    }
    @Test
    public void formatDoubleToStringTest2_1(){
        assertEquals("1234.00",formatDoubleToString("1234.0",2));
    }
    @Test
    public void formatDoubleToStringTest2_2(){
        assertEquals("1234.00",formatDoubleToString("1234.00",2));
    }
    @Test
    public void formatDoubleToStringTest2_3(){
        assertEquals("1234.00",formatDoubleToString("1234.000",2));
    }
    @Test
    public void formatDoubleToStringTest3_0(){
        assertEquals("1234.000",formatDoubleToString("1234",3));
    }
    @Test
    public void formatDoubleToStringTest3_1(){
        assertEquals("1234.000",formatDoubleToString("1234.0",3));
    }
    @Test
    public void formatDoubleToStringTest3_2(){
        assertEquals("1234.000",formatDoubleToString("1234.00",3));
    }
    @Test
    public void formatDoubleToStringTest3_3(){
        assertEquals("1234.000",formatDoubleToString("1234.000",3));
    }
    @Test
    public void formatDoubleToStringTest3_4(){
        assertEquals("1234.000",formatDoubleToString("1234.0000",3));
    }
    /* ----------------------------------------------------------------------------------------------- */
    /* ----------------------------------------------------------------------------------------------- */
    /* ----------------------------------------------------------------------------------------------- */
    @Test
    public void formatBigDecimalTest0_9_0(){
        assertEquals(new BigDecimal("1234.9"),formatBigDecimal("1234.9",0));
    }
    @Test
    public void formatBigDecimalTest0_9_1(){
        assertEquals(new BigDecimal("1234.9"),formatBigDecimal("1234.90",0));
    }
    @Test
    public void formatBigDecimalTest0_9_2(){
        assertEquals(new BigDecimal("1234.9"),formatBigDecimal("1234.900",0));
    }
    @Test
    public void formatBigDecimalTest2_9_0(){
        assertEquals(new BigDecimal("1234.90"),formatBigDecimal("1234.9",2));
    }
    @Test
    public void formatBigDecimalTest2_9_1(){
        assertEquals(new BigDecimal("1234.90"),formatBigDecimal("1234.90",2));
    }
    @Test
    public void formatBigDecimalTest2_9_2(){
        assertEquals(new BigDecimal("1234.90"),formatBigDecimal("1234.900",2));
    }
    @Test
    public void formatBigDecimalTest2_9_3(){
        assertEquals(new BigDecimal("1234.90"),formatBigDecimal("1234.9000",2));
    }
    @Test
    public void formatBigDecimalTest3_9_0(){
        assertEquals(new BigDecimal("1234.900"),formatBigDecimal("1234.9",3));
    }
    @Test
    public void formatBigDecimalTest3_9_1(){
        assertEquals(new BigDecimal("1234.900"),formatBigDecimal("1234.90",3));
    }
    @Test
    public void formatBigDecimalTest3_9_2(){
        assertEquals(new BigDecimal("1234.900"),formatBigDecimal("1234.900",3));
    }
    @Test
    public void formatBigDecimalTest3_9_3(){
        assertEquals(new BigDecimal("1234.900"),formatBigDecimal("1234.9000",3));
    }
    @Test
    public void formatBigDecimalTest3_9_4(){
        assertEquals(new BigDecimal("1234.900"),formatBigDecimal("1234.90000",3));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatBigDecimalToStringTest0_9_0(){
        assertEquals("1234.9",formatBigDecimalToString("1234.9",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_9_1(){
        assertEquals("1234.9",formatBigDecimalToString("1234.90",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_9_2(){
        assertEquals("1234.9",formatBigDecimalToString("1234.900",0));
    }
    @Test
    public void formatBigDecimalToStringTest2_9_0(){
        assertEquals("1234.90",formatBigDecimalToString("1234.9",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_9_1(){
        assertEquals("1234.90",formatBigDecimalToString("1234.90",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_9_2(){
        assertEquals("1234.90",formatBigDecimalToString("1234.900",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_9_3(){
        assertEquals("1234.90",formatBigDecimalToString("1234.9000",2));
    }
    @Test
    public void formatBigDecimalToStringTest3_9_0(){
        assertEquals("1234.900",formatBigDecimalToString("1234.9",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_9_1(){
        assertEquals("1234.900",formatBigDecimalToString("1234.90",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_9_2(){
        assertEquals("1234.900",formatBigDecimalToString("1234.900",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_9_3(){
        assertEquals("1234.900",formatBigDecimalToString("1234.9000",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_9_4(){
        assertEquals("1234.900",formatBigDecimalToString("1234.90000",3));
    }
    //////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatDoubleToStringTest0_9_0(){
        assertEquals("1234.9",formatDoubleToString("1234.9",0));
    }
    @Test
    public void formatDoubleToStringTest0_9_1(){
        assertEquals("1234.9",formatDoubleToString("1234.90",0));
    }
    @Test
    public void formatDoubleToStringTest0_9_2(){
        assertEquals("1234.9",formatDoubleToString("1234.900",0));
    }
    @Test
    public void formatDoubleToStringTest2_9_0(){
        assertEquals("1234.90",formatDoubleToString("1234.9",2));
    }
    @Test
    public void formatDoubleToStringTest2_9_1(){
        assertEquals("1234.90",formatDoubleToString("1234.90",2));
    }
    @Test
    public void formatDoubleToStringTest2_9_2(){
        assertEquals("1234.90",formatDoubleToString("1234.900",2));
    }
    @Test
    public void formatDoubleToStringTest2_9_3(){
        assertEquals("1234.90",formatDoubleToString("1234.9000",2));
    }
    @Test
    public void formatDoubleToStringTest3_9_0(){
        assertEquals("1234.900",formatDoubleToString("1234.9",3));
    }
    @Test
    public void formatDoubleToStringTest3_9_1(){
        assertEquals("1234.900",formatDoubleToString("1234.90",3));
    }
    @Test
    public void formatDoubleToStringTest3_9_2(){
        assertEquals("1234.900",formatDoubleToString("1234.900",3));
    }
    @Test
    public void formatDoubleToStringTest3_9_3(){
        assertEquals("1234.900",formatDoubleToString("1234.9000",3));
    }
    @Test
    public void formatDoubleToStringTest3_9_4(){
        assertEquals("1234.900",formatDoubleToString("1234.90000",3));
    }
    /* ----------------------------------------------------------------------------------------------- */
    /* ----------------------------------------------------------------------------------------------- */
    /* ----------------------------------------------------------------------------------------------- */
    @Test
    public void formatBigDecimalTest0_09_0(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.09",0));
    }
    @Test
    public void formatBigDecimalTest0_09_1(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.090",0));
    }
    @Test
    public void formatBigDecimalTest0_09_2(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.0900",0));
    }
    @Test
    public void formatBigDecimalTest2_09_0(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.09",2));
    }
    @Test
    public void formatBigDecimalTest2_09_1(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.090",2));
    }
    @Test
    public void formatBigDecimalTest2_09_2(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.0900",2));
    }
    @Test
    public void formatBigDecimalTest2_09_3(){
        assertEquals(new BigDecimal("1234.09"),formatBigDecimal("1234.09000",2));
    }
    @Test
    public void formatBigDecimalTest3_09_0(){
        assertEquals(new BigDecimal("1234.090"),formatBigDecimal("1234.09",3));
    }
    @Test
    public void formatBigDecimalTest3_09_1(){
        assertEquals(new BigDecimal("1234.090"),formatBigDecimal("1234.090",3));
    }
    @Test
    public void formatBigDecimalTest3_09_2(){
        assertEquals(new BigDecimal("1234.090"),formatBigDecimal("1234.0900",3));
    }
    @Test
    public void formatBigDecimalTest3_09_3(){
        assertEquals(new BigDecimal("1234.090"),formatBigDecimal("1234.09000",3));
    }
    @Test
    public void formatBigDecimalTest3_09_4(){
        assertEquals(new BigDecimal("1234.090"),formatBigDecimal("1234.090000",3));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatBigDecimalToStringTest0_09_0(){
        assertEquals("1234.09",formatBigDecimalToString("1234.09",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_09_1(){
        assertEquals("1234.09",formatBigDecimalToString("1234.090",0));
    }
    @Test
    public void formatBigDecimalToStringTest0_09_2(){
        assertEquals("1234.09",formatBigDecimalToString("1234.0900",0));
    }
    @Test
    public void formatBigDecimalToStringTest2_09_0(){
        assertEquals("1234.09",formatBigDecimalToString("1234.09",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_09_1(){
        assertEquals("1234.09",formatBigDecimalToString("1234.09",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_09_2(){
        assertEquals("1234.09",formatBigDecimalToString("1234.0900",2));
    }
    @Test
    public void formatBigDecimalToStringTest2_09_3(){
        assertEquals("1234.09",formatBigDecimalToString("1234.09000",2));
    }
    @Test
    public void formatBigDecimalToStringTest3_09_0(){
        assertEquals("1234.090",formatBigDecimalToString("1234.09",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_09_1(){
        assertEquals("1234.090",formatBigDecimalToString("1234.090",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_09_2(){
        assertEquals("1234.090",formatBigDecimalToString("1234.0900",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_09_3(){
        assertEquals("1234.090",formatBigDecimalToString("1234.09000",3));
    }
    @Test
    public void formatBigDecimalToStringTest3_09_4(){
        assertEquals("1234.090",formatBigDecimalToString("1234.090000",3));
    }
    //////////////////////////////////////////////////////////////////////////////
    @Test
    public void formatDoubleToStringTest0_09_0(){
        assertEquals("1234.09",formatDoubleToString("1234.09",0));
    }
    @Test
    public void formatDoubleToStringTest0_09_1(){
        assertEquals("1234.09",formatDoubleToString("1234.090",0));
    }
    @Test
    public void formatDoubleToStringTest0_09_2(){
        assertEquals("1234.09",formatDoubleToString("1234.0900",0));
    }
    @Test
    public void formatDoubleToStringTest2_09_0(){
        assertEquals("1234.09",formatDoubleToString("1234.09",2));
    }
    @Test
    public void formatDoubleToStringTest2_09_1(){
        assertEquals("1234.09",formatDoubleToString("1234.090",2));
    }
    @Test
    public void formatDoubleToStringTest2_09_2(){
        assertEquals("1234.09",formatDoubleToString("1234.0900",2));
    }
    @Test
    public void formatDoubleToStringTest2_09_3(){
        assertEquals("1234.09",formatDoubleToString("1234.09000",2));
    }
    @Test
    public void formatDoubleToStringTest3_09_0(){
        assertEquals("1234.090",formatDoubleToString("1234.09",3));
    }
    @Test
    public void formatDoubleToStringTest3_09_1(){
        assertEquals("1234.090",formatDoubleToString("1234.090",3));
    }
    @Test
    public void formatDoubleToStringTest3_09_2(){
        assertEquals("1234.090",formatDoubleToString("1234.0900",3));
    }
    @Test
    public void formatDoubleToStringTest3_09_3(){
        assertEquals("1234.090",formatDoubleToString("1234.09000",3));
    }
    @Test
    public void formatDoubleToStringTest3_09_4(){
        assertEquals("1234.090",formatDoubleToString("1234.090000",3));
    }
}
