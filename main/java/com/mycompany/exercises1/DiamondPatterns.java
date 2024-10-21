/**
 *
 * @author Bethiane
 */
package com.mycompany.exercises1;

import java.util.Scanner;

public class DiamondPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            n++;
        }

        int spaces = n / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= n / 2 + 1; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
            spaces--;
            stars += 2;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = n - 2;

        for (int i = 1; i <= n / 2; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
            spaces++;
            stars -= 2;
        }

        scanner.close();
    }
}
