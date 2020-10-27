
import java.util.Scanner;
/**
 * Program to encrypt and decrypt messages
 * 
 * @author Derek Xu
 * 
 * @version 10/21/2020
 */

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        String input = "";
        int key = 0;
        Scanner s = new Scanner(System.in);
        Encryptor enc = new Encryptor();

        System.out.println("Welcome to the Cipher");
        while (!input.equals("quit")) {
            System.out.println("Would you like to encrypt, decrypt, or quit");
            input = "";
            input = s.nextLine().trim().toLowerCase();

            if (!input.equals("encrypt") && !input.equals("decrypt") && !input.equals("quit") && !input.equals("")){
                System.out.println("Please input a proper command.");
            }
            else if (input.equals("encrypt")) {
                System.out.println("What would you like to encrypt?");
                String enMessage = s.nextLine();
                System.out.println("Key?");
                key = s.nextInt();
                s.nextLine();
                System.out.println("Original: " + enMessage);

                String output = enc.encryptCaesar(key, enMessage);
                System.out.println("Message: " + output + "\n");
            }
            else if (input.equals("decrypt")) {
                System.out.println("What would you like to decrypt?");
                String deMessage = s.nextLine();
                System.out.println(deMessage);
            }


        }
    }

}