package com.codeware.ArrayDiff;

import java.util.*;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list
 * from another and returns the result.
 * <p>
 * It should remove all values from list a, which are present in list b keeping their order.
 * <p>
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * If a value is present in b, all of its occurrences must be removed from the other:
 * <p>
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 3}, new int[]{1, 2, 5, 6, 7, 8})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        if (b.length == 0) {
            return a;
        } else if (a.length == 0) {
            return new int[0];
        } else {
            for (int i : a) {
                boolean flag = true;
                for (int n : b) {
                    if (i == n) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result.add(i);
                }
            }
            int[] r = new int[result.size()];
            int i = 0;
            for (Integer res : result) r[i++] = res;
            return r;
        }
    }

}