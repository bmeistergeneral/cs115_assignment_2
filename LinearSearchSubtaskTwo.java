// *************************************************************************
// CS115 Assignment 2 Subtask 2
// Brecon Morgan
//
// Note: Copied code given in example as a starting point for assignment 2.
// *************************************************************************

import java.util.Scanner;
import java.util.Random;

public class LinearSearchSubtaskTwo {
    private static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1; // not found
    }

    // Main program to test the linearSearch() method
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random rand = new Random();
        int upperbound = 101;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(upperbound);
        }

        System.out.println("Array elements are: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n" + "Input a number to search: ");
        Scanner scnr = new Scanner(System.in);
        int key = scnr.nextInt();
        int keyIndex = linearSearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        } else {
            System.out.printf("Found %d at index %d.\n", key, keyIndex);
        }
    }
}

