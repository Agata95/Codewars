package com.codeware.SpinWords;

import java.util.Arrays;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces. Spaces will be included only
 * when more than one word is present.
 * Examples:
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords("This is a test") => returns "This is a test"
 * spinWords( "This is another test") => returns "This is rehtona test"
 */

public class SpinWords {
    public static void main(String[] args) {
//        System.out.println(spinWords("Hey fellow warriors"));
//        System.out.println(spinWords("Welcome"));
//        System.out.println(spinWords("This sentence is a sentence"));
        System.out.println(spinWords("Just kidding there is still one more"));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
//        String flag = words[words.length - 1];
        Boolean lastWord = false;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderLetters = new StringBuilder();
        for (String word : words) {
            if (word.equals(words[words.length-1])) {
                lastWord = true;
            }
            if (word.length() > 4) {
                stringBuilderLetters.delete(0, 100);
                stringBuilderLetters.append(word).reverse();
                word = stringBuilderLetters.toString();
            }
            if (lastWord) {
                stringBuilder.append(word);
            } else {
                stringBuilder.append(word + " ");
            }
        }
        return stringBuilder.toString();
    }
}
