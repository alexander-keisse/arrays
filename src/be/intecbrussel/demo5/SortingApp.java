package be.intecbrussel.demo5;

import java.util.Arrays;
import java.util.Random;

public class SortingApp {

    public static void main(String[] args) {

        final int ITERATIONS = 1000;
        final int ARRAY_LENGTH = 1000;
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS; i++) {

            int[] numbers = new int[ARRAY_LENGTH];

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = random.nextInt();
            }

            SortingUtil.bubbleSort(numbers);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution time bubble sort: " + (endTime - startTime) + "ms\n");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS; i++) {

            int[] numbers = new int[ARRAY_LENGTH];

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = random.nextInt();
            }

            SortingUtil.selectionSort(numbers);
        }

        endTime = System.currentTimeMillis();
        System.out.println("\nExecution time Selection sort: " + (endTime - startTime) + "ms\n");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATIONS; i++) {

            int[] numbers = new int[ARRAY_LENGTH];

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = random.nextInt();
            }

            SortingUtil.insertionSort(numbers);
        }

        endTime = System.currentTimeMillis();
        System.out.println("\nExecution time Insertion sort: " + (endTime - startTime) + "ms\n");

    }

}
