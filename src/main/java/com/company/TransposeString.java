package com.company;

public class TransposeString {

    public String transposeString(String inputString){

        if(inputString == null){
            return "Null Input not expected";
        }

        String[] splitInputStirng   =   inputString.split(" ");
        String transposedString     =   new String();

        for (int i=0;i<splitInputStirng.length;i++){
            StringBuilder stringBuilder =   new StringBuilder(splitInputStirng[i]);
            transposedString    =   transposedString.concat(stringBuilder.reverse().toString());
        }
        return transposedString;
    }

}
