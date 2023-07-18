// *************************************************************************
// CS115 Assignment 2 Bonus - This is the subtask 2 solution but allows for finding repeat values at multiple indexes.
// Brecon Morgan
//
// Note: Copied code given in example as a starting point for assignment 2.
// *************************************************************************

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class LinearSearchBonus {
    private static ArrayList linearSearch(int[] numbers, int key) {
        ArrayList multipleIndexes = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {

                multipleIndexes.add(Integer.valueOf(i));
            }
        }

        return multipleIndexes;
    }

    // Main program to test the linearSearch() method
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random rand = new Random();
        int upperbound = 101;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(upperbound);
        }

        System.out.println("Randomly generated numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n" + "Enter an integer value from the above list to search: ");
        Scanner scnr = new Scanner(System.in);
        int key = scnr.nextInt();

        ArrayList<Integer> results = linearSearch(numbers, key);

        if (results.size() > 0) {

            System.out.printf("Found %d at indexes:", key);

            for (int index : results) {
                System.out.printf(" %d", index);
            }
        } else {
            System.out.println(key + " was not found.");
        }
    }
}

