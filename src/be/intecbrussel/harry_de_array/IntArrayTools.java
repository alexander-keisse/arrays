package be.intecbrussel.harry_de_array;

public class IntArrayTools {

    public static boolean isSorted(int[] numbers, boolean ascending) {
        for (int i = 1; i < numbers.length; i++) {  // 1, 6

            if (ascending && numbers[i - 1] > numbers[i]
                    || !ascending && numbers[i - 1 ] < numbers[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sort(int[] numbers, boolean ascending) {

        for (int gap = numbers.length / 2; gap > 0; gap/=2) {

            for (int i = gap; i < numbers.length; i++) {

                insertion(numbers, ascending, gap, i);
            }
        }

        return numbers;
    }

    public static void insertion(int[] numbers, boolean ascending, int gap, int start) {

        int temp = numbers[start];

        for (; start >= gap; start -= gap) {

            if (ascending && numbers[start - gap] < temp || !ascending && numbers[start - gap] > temp) {
                break;
            }

            numbers[start] = numbers[start - gap];
        }

        numbers[start] = temp;

    }

    public static boolean chopSearch(int[] numbers, int key) {

        if (! isSorted(numbers, true)) {
            sort(numbers, true);
        }

        return binarySearchIterative(numbers, key);
    }

    public static boolean binarySearchIterative(int[] numbers, int key) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (numbers[mid] == key) {
                return true;
            } else if (numbers[mid] < key) {
                left = mid + 1;
            } else  {
                right = mid - 1;
            }

        }
        return false;
    }
}
