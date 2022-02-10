package be.intecbrussel.opdrachten;

public class Opdracht3 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][6];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = i + j;
            }
        }

        for (int[] row: matrix) {

            for (int el: row) {
                System.out.printf("%5d", el);
            }
            System.out.println();
        }

    }
}
