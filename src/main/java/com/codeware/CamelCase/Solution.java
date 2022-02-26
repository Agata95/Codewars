package com.codeware.CamelCase;


/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
 * within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
 * also often referred to as Pascal case).
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(toCamelCase("some_text to test"));
    }

    static String toCamelCase(String s) {
        String[] arrayWords = s.split("[^a-zA-Z]");
        String worlds ="";
        for (int i = 1; i < arrayWords.length; i++) {
            String newWorld = arrayWords[i].substring(0, 1).toUpperCase() + arrayWords[i].substring(1);
            worlds = worlds+newWorld;
        }
        return arrayWords[0]+worlds;
    }
}
