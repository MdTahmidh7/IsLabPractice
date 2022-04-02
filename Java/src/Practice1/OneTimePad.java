package Practice1;

import java.util.Scanner;

public class OneTimePad {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        int textIndex;
        int padIndex;
        String text;
        String pad;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Text : ");
        text = s.next();
        System.out.println(text);
        int[] cipherIndex = new int[text.length()];
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            textIndex = ALPHABET.indexOf(text.charAt(i));
            System.out.print(textIndex + " ");
        }
        System.out.println("\nEnter pad as same length as the text : ");
        pad = s.next();
        System.out.println(pad);
        for (int i = 0; i < pad.length(); i++) {
            padIndex = ALPHABET.indexOf(pad.charAt(i));
            System.out.print(padIndex + " ");
        }
        System.out.println("\n Cipher Code  :  ");
        for (int i = 0; i < text.length(); i++) {
            textIndex = ALPHABET.indexOf(text.charAt(i));
            padIndex = ALPHABET.indexOf(pad.charAt(i));
            int temp = textIndex + padIndex;
            if (temp > 26) {
                temp = temp - 26;
                System.out.print(" " + ALPHABET.charAt(temp));
            } else {
                System.out.print(" " + ALPHABET.charAt(temp));
            }
        }
    }
}
