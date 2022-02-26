package com.codeware.ShortestWord;

import java.util.ArrayList;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */

public class Kata {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int findShort(String s) {
        String[] arrayStrings = s.split(" ");
        int minLength = arrayStrings[0].length();
        for (String word :
                arrayStrings) {
            int length = word.length();
            minLength = Math.min(minLength, length);
        }
        return minLength;
    }
}
