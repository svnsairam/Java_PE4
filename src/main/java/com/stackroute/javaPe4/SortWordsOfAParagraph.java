package com.stackroute.javaPe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortWordsOfAParagraph {
    public String sortWordsOfParagraph(String inputParagraph) {
        if (inputParagraph == null) {
            return "Null Input not expected";
        }
        String resultantStirng = new String();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputParagraph.toLowerCase());
        ArrayList<String> arrayListOfWords = new ArrayList<>();
        while (matcher.find()) {
            arrayListOfWords.add(matcher.group());
        }
        Collections.sort(arrayListOfWords);
        for (int i = 0; i < arrayListOfWords.size(); i++) {
            resultantStirng = resultantStirng.concat(arrayListOfWords.get(i) + " ");
        }
        System.out.println(resultantStirng);
        return resultantStirng;
    }
}