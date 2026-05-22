package org.example.arrays;

public class FindMaxNum {
    public static void main (String[] args) {
        int[] numbers = {9, 3, 11, 7, 2};

        System.out.print("Give numbers: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.print("\nThe largest number is: " + findMax(numbers));
    }

    public static int findMax (int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
