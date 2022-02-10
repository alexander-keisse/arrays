package be.intecbrussel.demo2;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 9}, {7}};

        System.out.println("Length of row 1: " + numbers[0].length);
        System.out.println("Length of row 2: " + numbers[1].length);
        System.out.println("Length of row 3: " + numbers[2].length);

        for(int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
            System.out.println();
        }

        Random random = new Random();
        final int ROW = 12;
        final int COLUMN = 6;

        int[][] lottoNumbers = new int[ROW][COLUMN];

        for (int i = 0; i < lottoNumbers.length; i++) {

            for (int j = 0; j < lottoNumbers[i].length; j++) {

                lottoNumbers[i][j] = random.nextInt(45) + 1;
            }
        }

        System.out.println("\n\nLotto numbers:\n\n");

        for (int[] rows: lottoNumbers) {
            for (int element: rows) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

}
