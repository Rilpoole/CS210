import java.util.Scanner;

public class Main {
    /**
     * Allows entry point for Assignment 2 - Caesar Cipher
     * Takes two inputs through standard input, the first is the plaintext string,
     * the secons is the shift number as an integer.
     * The return is the encrypted string.
     * Takes inputs through standard input until input lines have been exhausted.
     * @param args
     */
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        while(scr.hasNextLine()){
            String plainText = scr.nextLine();
            int shift = Integer.parseInt(scr.nextLine());
            System.out.println(CaesarCipher.encrypt(plainText, shift));
        }
        scr.close();
    }
}
