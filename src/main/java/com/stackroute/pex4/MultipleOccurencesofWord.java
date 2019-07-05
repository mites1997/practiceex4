//Write a program to find out the multiple occurrences of the given word in a string using Matcher
//methods.
package com.stackroute.pex4;
import java.util.regex.*;

public class MultipleOccurencesofWord {
    public String findMultipleoOccurences(String text, String p) {
        String output="";
        if(text.equals("")||p.equals(""))
            return "invalid input"; //checked for invalid input
        while (true) {

            Pattern pattern = Pattern.compile(p);//the given pattern p is compiled

            Matcher matcher = pattern.matcher(text);//the given pattern is matched with text
            boolean found = false;
            while (matcher.find()) {
                output=output+"I found the text " + matcher.group() + " starting at index " +
                        matcher.start() + " and ending at index " + matcher.end();//The position of the pattern is found
                found = true;
            }
            if (!found) {
                return "No match found.";//not found condition


            }
            return output;
        }
    }
}