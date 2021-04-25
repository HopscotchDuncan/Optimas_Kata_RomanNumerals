package edu.bsu.cs222;

public class RomanNumeralToInt {

    public int convertRomanNumeralToInt(String i) {
        if(i.length()<1){
            return 0;
        }else if(i.length()>=2 && getValueOfCharacters(i.substring(0,2))!=0){
            return getValueOfCharacters(i.substring(0,2)) + convertRomanNumeralToInt(i.substring(2));
        }else if (getValueOfCharacters(i.substring(0,1))!=0){
            return getValueOfCharacters(i.substring(0,1)) + convertRomanNumeralToInt(i.substring(1));
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getValueOfCharacters(String i) {
        return switch (i) {
            case "I" -> 1;
            case "IV" -> 4;
            case "V" -> 5;
            case "IX" -> 9;
            case "X" -> 10;
            case "XL" -> 40;
            case "L" -> 50;
            case "XC" -> 90;
            case "C" -> 100;
            case "CD" -> 400;
            case "D" -> 500;
            case "CM" -> 900;
            case "M" -> 1000;
            default -> 0;
        };
    }
}