/**
 *
 * @author Bethiane
 */
package com.mycompany.exercises1;

public class LargestArrayElement {

    public static void main(String[] args) {

        int[] numbers = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The array elements are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nThe largest element in the array is: " + largest);
    }
}
