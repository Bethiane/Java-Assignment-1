/**
 *
 * @author Bethiane
 */
package com.mycompany.exercises1;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D, or F): ");
        String grade = scanner.next().toUpperCase();

        switch (grade) {
            case "A":
                System.out.println("Excellent! Keep up the great work!");
                break;
            case "B":
                System.out.println("Good job! You're doing well.");
                break;
            case "C":
                System.out.println("Satisfactory. There's room for improvement.");
                break;
            case "D":
                System.out.println("You need to work harder. Seek help if needed.");
                break;
            case "F":
                System.out.println("Failed. Please consult with your teacher.");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
        }

        scanner.close();
    }
}
