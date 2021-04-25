package edu.bsu.cs222;

import java.util.HashMap;

public class RomanNumeralToInt {
    HashMap<String, Integer> romanNumeralValues = new HashMap<>(){{
        put("I", 1);
        put("IV", 4);
        put("V", 5);
        put("IX", 9);
        put("X", 10);
        put("XL", 40);
        put("L", 50);
        put("XC", 90);
        put("C", 100);
        put("CD", 400);
        put("D", 500);
        put("CM", 900);
        put("M", 1000);
    }};

    public int convertRomanNumeralToInt(String i) {
        if(i.length()<1){
            return 0;
        }else if(i.length()>=2 && romanNumeralValues.containsKey(i.substring(0,2))){
            return romanNumeralValues.get(i.substring(0,2)) + convertRomanNumeralToInt(i.substring(2));
        }else if (romanNumeralValues.containsKey(i.substring(0,1))){
            return romanNumeralValues.get(i.substring(0,1)) + convertRomanNumeralToInt(i.substring(1));
        }else{
            throw new IllegalArgumentException();
        }
    }
}