/**
 *
 * @author Bethiane
 */
package com.mycompany.exercises1;

public class ArrayReversal {
    public static void main(String[] args) {
        
        int[] originalArray = {3, 4, 6, 1, 9, 7, 5, 8};        
      
        System.out.println("Original Array:");
        printArray(originalArray);        
        
        reverseArray(originalArray);        
        
        System.out.println("\nReversed Array:");
        printArray(originalArray);
    }
    
    // method for reversing
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // swapping elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move towards the center
            start++;
            end--;
        }
    }
    
    // method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
