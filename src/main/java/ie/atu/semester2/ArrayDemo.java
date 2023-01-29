package ie.atu.semester2;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        // Declares an array of integers
        int[] anArray;

        // Allocates memory for 10 integers
        anArray = new int[10];

        // Initialize the elements
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;

        System.out.println("Please enter a value: ");
        Scanner myscan = new Scanner(System.in);
        anArray[9] = myscan.nextInt();

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 9: " + anArray[9]);

    }

}
