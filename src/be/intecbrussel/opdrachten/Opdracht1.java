package be.intecbrussel.opdrachten;

import java.util.Arrays;

public class Opdracht1 {

    public static void main(String[] args) {

        int[] numbers = new int[20];

        for (int i = 0, j = 1; i < numbers.length; i++) {
            numbers[i] = j++ * 7;
        }

        System.out.println(Arrays.toString(numbers));
    }

}
