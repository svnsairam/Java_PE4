/*
Write a program to transpose the given string.
 Input String : a quick brown fox jumps over the lazy dog
 Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
 */
package com.stackroute.javaPe4;

public class TransposeString {
    public String transposeString(String inputString) {
        if (inputString == null) {
            return "Null Input not expected";
        }
        // split the strings using space " " and collect the strings into String array[] and reverse each string.
        String[] splitInputStirng = inputString.split(" ");
        String transposedString = new String();
        for (int i = 0; i < splitInputStirng.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(splitInputStirng[i]);
            transposedString = transposedString.concat(stringBuilder.reverse().toString());
        }
        return transposedString;
    }
}
