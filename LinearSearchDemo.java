// Copied code given in example as a starting point for assignment 2.
import java.util.Scanner;
public class LinearSearchDemo {
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

        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values.");
        Scanner scnr = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter number %d: ", (i + 1));
            numbers[i] = scnr.nextInt();
        }

        System.out.println("Array elements are: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n" + "Input a number to search: ");

        int key = scnr.nextInt();
        int keyIndex = linearSearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        } else {
            System.out.printf("Found %d at index %d.\n", key, keyIndex);
        }
    }
}
