/*
Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry

 */
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


