package com.codeware.WhichAreIn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which
 * are substrings of strings of a2.
 * <p>
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 * <p>
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * <p>
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: r must be without duplicates.
 */

public class WhichAreIn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> words = new HashSet<>();
        for (String a1 : array1) {
            for (String a2 : array2) {
                if (a2.contains(a1)) {
                    words.add(a1);
                }
            }
        }
        String[] result = words.toArray(new String[words.size()]);
        Arrays.sort(result);
        return result;
    }
}
