package com.stackroute.javaPe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHarry {
    public String findHarryInGivenString(String inputString) {
        if (inputString == null) {
            return "Null input is not expected";
        }
        inputString = inputString.toUpperCase();
        Pattern pattern1 = Pattern.compile("HARRY");
        Matcher matcher1 = pattern1.matcher(inputString);

        while (matcher1.find()) {
            // This is Harry i am harry he is harry
            System.out.println(matcher1.group());
            System.out.println(matcher1.start());
            System.out.println(matcher1.end());

        }
        return "Is Harry here ? false";
    }
}
