package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralToIntTest {
    RomanNumeralToInt romanNumeralToInt = new RomanNumeralToInt();

    @Test
    public void testRomanNumeralI(){
        Assertions.assertEquals(1,romanNumeralToInt.convertStringToInt("I"));
    }

    @Test
    public void testRomanNumeralIV(){
        Assertions.assertEquals(4,romanNumeralToInt.convertStringToInt("IV"));
    }

    @Test
    public void testRomanNumeralV(){
        Assertions.assertEquals(5,romanNumeralToInt.convertStringToInt("V"));
    }

    @Test
    public void testRomanNumeralIX(){
        Assertions.assertEquals(9,romanNumeralToInt.convertStringToInt("IX"));
    }

    @Test
    public void testRomanNumeralX(){
        Assertions.assertEquals(10,romanNumeralToInt.convertStringToInt("X"));
    }

    @Test
    public void testRomanNumeralXL(){
        Assertions.assertEquals(40,romanNumeralToInt.convertStringToInt("XL"));
    }

    @Test
    public void testRomanNumeralL(){
        Assertions.assertEquals(50,romanNumeralToInt.convertStringToInt("L"));
    }

    @Test
    public void testRomanNumeralXC(){
        Assertions.assertEquals(90,romanNumeralToInt.convertStringToInt("XC"));
    }

    @Test
    public void testRomanNumeralC(){
        Assertions.assertEquals(100,romanNumeralToInt.convertStringToInt("C"));
    }

    @Test
    public void testRomanNumeralCD(){
        Assertions.assertEquals(400,romanNumeralToInt.convertStringToInt("CD"));
    }
}
