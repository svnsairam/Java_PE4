/*
Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
 */
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
        // Use the pattern matcher to find the word strings and remove all others
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputParagraph.toLowerCase());
        ArrayList<String> arrayListOfWords = new ArrayList<>();
        while (matcher.find()) {
            arrayListOfWords.add(matcher.group());
        }
        // Use the sort() function present in collections and sort the arrayList.
        Collections.sort(arrayListOfWords);
        for (int i = 0; i < arrayListOfWords.size(); i++) {
            resultantStirng = resultantStirng.concat(arrayListOfWords.get(i) + " ");
        }
        System.out.println(resultantStirng);
        return resultantStirng;
    }
}
