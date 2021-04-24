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
            default -> 50;
        };
    }
}
