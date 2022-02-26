package com.codeware.IsThisTriangle;

/**
 * Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be
 * built with the sides of given length and false in any other case.
 * <p>
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 */

public class TriangleTester {
    public static void main(String[] args) {
        System.out.println(isTriangle(3, 4, 5));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a > 0 || b > 0 || c > 0) {

            if (a >= b && a >= c && (b + c > a)) {
                return true;
            } else if (b >= a && b >= c && (a + c > b)) {
                return true;
            } else if (c >= a && c >= b && (a + b > c)) {
                return true;
            }
        }
        return false;
    }
}
