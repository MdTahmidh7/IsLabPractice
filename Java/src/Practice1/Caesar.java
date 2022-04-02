package Practice1;

import java.util.Scanner;

public class Caesar {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public  void encryptionCaesarCipher(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String to encrypt : ");
        String plaintext = s.next();
        int index;
        int shiftKey;
        plaintext = plaintext.toLowerCase();
        System.out.println("Plain Text");
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i));
            System.out.print(ALPHABET.charAt(index)+"   ");
        }
        System.out.println();
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i));
            System.out.print(index+"  ");
        }
        System.out.println("\nEnter Encryption Key : ");
        shiftKey = s.nextInt();
        System.out.println("\nCipher Text");
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i))+shiftKey;
            index = index%26;
            System.out.print(ALPHABET.charAt(index)+"   ");
        }
        System.out.println();
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i))+shiftKey;
            index = index%26;
            System.out.print(index+"  ");
        }
    }
    public  void decryptionCaesarCipher(){
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter a String to decrypt: ");
        String plaintext = s.next();
        int index;
        int shiftKey;
        plaintext = plaintext.toLowerCase();
        System.out.println();
        System.out.println("Cipher Text");
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i));
            System.out.print(ALPHABET.charAt(index)+"   ");
        }
        System.out.println();
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i));
            System.out.print(index+"  ");
        }
        System.out.println("\nEnter Decryption Key : ");
        shiftKey = s.nextInt();
        System.out.println("\n\nPlain Text");
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i))-shiftKey;
           if (index < 0){
               index = index + ALPHABET.length();
           }
            System.out.print(ALPHABET.charAt(index)+"   ");
        }
        System.out.println();
        for (int i = 0; i < plaintext.length(); i++) {
            index = ALPHABET.indexOf(plaintext.charAt(i))-shiftKey;
            if (index < 0){
                index = index + ALPHABET.length();
            }
            System.out.print(index+"  ");
        }
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        caesar.encryptionCaesarCipher();
        caesar.decryptionCaesarCipher();

    }
}












