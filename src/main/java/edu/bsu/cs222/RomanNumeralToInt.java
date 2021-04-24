package edu.bsu.cs222;

public class RomanNumeralToInt {

    public int convertStringToInt(String i) {
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
            default -> 1000;
        };
    }
}
