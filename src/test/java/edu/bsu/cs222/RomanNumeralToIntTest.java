package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralToIntTest {
    RomanNumeralToInt romanNumeralToInt = new RomanNumeralToInt();

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "4, IV",
            "5, V",
            "9, IX",
            "10, X",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "900, CM",
            "1000, M",
            "41, XLI",
            "1688, MDCLXXXVIII",
            "3000, MMM",
            "4999, MMMMCMXCIX"
    })
    void testConvertRomanNumeralToInt(int number,String romanNumeral) {
        assertEquals(number,romanNumeralToInt.convertRomanNumeralToInt(romanNumeral));
    }

    @Test
    public void testRandomString(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> romanNumeralToInt.convertRomanNumeralToInt("JQIOPGHOAHUBLSHJAGHJ"));
    }
}