package com.stackroute.javaPe4;

public class ReplaceCharecters {
    public String replaceCharecters(String inputStirng) {
        if (inputStirng == null) {
            return "Null Input not expected";
        }
        inputStirng = inputStirng.replaceAll("d", "f").replaceAll("l", "t");
        return inputStirng;
    }
}


