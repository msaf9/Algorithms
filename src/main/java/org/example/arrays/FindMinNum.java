package org.example.arrays;

public class FindMinNum {
    public static void main (String[] args) {
        int[] numbers = {9, 3, 1, 7, -2, 11};

        check(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        FindMinNum findMinNum = new FindMinNum();

        System.out.print("\nThe smallest number is: " + findMinNum.findMin(numbers));
    }

    public static void check (int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("numbers array cannot be null or empty!");
        }
    }

    int findMin (int[] numbers) {
        check(numbers);

        int min = numbers[0];

        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }

        return min;
    }
}
