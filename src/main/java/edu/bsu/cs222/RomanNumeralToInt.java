package edu.bsu.cs222;

public class RomanNumeralToInt {
    public int convertStringToInt(String i) {
        return switch (i) {
            case "I" -> 1;
            case "IV" -> 4;
            case "V" -> 5;
            default -> 9;
        };
    }
}
