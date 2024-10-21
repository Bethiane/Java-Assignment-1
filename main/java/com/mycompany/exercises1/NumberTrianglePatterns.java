/**
 *
 * @author Bethiane
 */
package com.mycompany.exercises1;

public class NumberTrianglePatterns {

    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // go to next line after each row
            System.out.println();
        }
    }
}
