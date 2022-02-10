package be.intecbrussel.demo1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 14;
        numbers[1] = 4;
        numbers[2] = 1;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2;
        numbers2 = new int[] {12, 35, 35, 55};

        System.out.println(Arrays.toString(numbers2));

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > 50) {
                numbers2[i] = 50;
            }
            System.out.println(numbers2[i]);
        }

        String text = "This sentence will be converted to an array";
        String[] diffWords = text.split(" ");

        for (String s: diffWords) {
            System.out.println(s);
        }

        char[] charCollection = text.toCharArray();

        for(char c: charCollection) {
            System.out.println(c);
        }


    }

}
