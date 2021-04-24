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
}
