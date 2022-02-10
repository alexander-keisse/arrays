package be.intecbrussel.opdrachten;

import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Please fill in a line of text: ");
        String text = kbd.nextLine();

        String[] diffWords = text.split(" ");

        for (String word: diffWords) {
            System.out.println(word);
        }

    }
}
