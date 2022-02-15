package be.intecbrussel.harry_de_array;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        int[] numbers = {22, 15, 5, -25};
        boolean ascending = false;

        System.out.println("Array is sorted: "
                + IntArrayTools.isSorted(numbers, ascending));

        System.out.println();

        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        IntArrayTools.sort(numbers, true);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
        IntArrayTools.sort(numbers, false);
        System.out.println("Array after sorting for the second time: " + Arrays.toString(numbers));

        System.out.println();

        System.out.println("The number is found in the array: "
                + IntArrayTools.chopSearch(numbers, -88));

        char[] chars = {'a', ' ', '?', 'b'};
        char[] filteredChars = CharArrayTools.filterAlphabet(chars);

        System.out.println("The filtered array looks like this: "
                + Arrays.toString(filteredChars));

        char[] charsToSort = {'a', 'd', 'p', 'b', 'm'};

        System.out.println("Before sorting: " + Arrays.toString(charsToSort));
        CharArrayTools.sort(charsToSort);
        System.out.println("After sorting: " + Arrays.toString(charsToSort));
    }

}
