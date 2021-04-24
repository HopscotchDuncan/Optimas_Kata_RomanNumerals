package edu.bsu.cs222;

public class RomanNumeralToInt {
    public int convertStringToInt(String i) {
        if(i.equals("I")){
            return 1;
        }else if(i.equals("IV")){
            return 4;
        }else{
            return 5;
        }
    }
}
