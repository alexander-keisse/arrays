package be.intecbrussel.demo5;

public class SortingUtil {

    /*
    More info can be found here:

    bubble sort:    https://www.youtube.com/watch?v=xli_FI7CuzA
                    https://www.baeldung.com/java-bubble-sort

    selection sort: https://www.youtube.com/watch?v=g-PGLbMth_g
                    https://www.baeldung.com/java-selection-sort

    insertion sort: https://www.youtube.com/watch?v=JU767SDMDvA
                    https://www.baeldung.com/java-insertion-sort
     */

    public static void bubbleSort(int[] numbers) {

        /*
        During each iteration we will compare the left value to the right value
        and swap them if the left value is bigger then the right value.
         */

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < (numbers.length - 1) - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int[] numbers) {

         /*
        During each iteration we'll select the smallest item
        from the unsorted partition and move it to the end of the sorted partition.
         */

        for (int i = 0; i < numbers.length; i++) {

            int smallestValue = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[smallestValue]) {
                    smallestValue = j;
                }
            }

            int temp = numbers[smallestValue];
            numbers[smallestValue] = numbers[i];
            numbers[i] = temp;

        }
    }

    public static void insertionSort(int[] numbers) {

        /*
        We will do these things:

        1. Work left to right
        2. Examine each item and compare it to items on its left
        3. Insert the item in the correct position in the array
         */

        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i;

            while (j > 0 && numbers[j - 1] > key)  {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = key;
        }
    }
}
