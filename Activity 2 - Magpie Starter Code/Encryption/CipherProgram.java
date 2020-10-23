
import java.util.Scanner;
/**
 * Program to encrypt and decrypt messages
 * 
 * @author Derek Xu
 * 
 * @version 10/21/2020
 */

public class CipherProgram {
    public static void main(String[] args) {
        boolean running = true;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Cipher");
        while (running) {
            System.out.println("Would you like to encrypt, decrypt, or quit");
            String input = s.nextLine().trim().toLowerCase();

            if (input.equals("encrypt")) {
                System.out.print("What would you like to encrypt? ");
                String message = s.nextLine();
            }
            else if (input.equals("quit")) {
                break;
            }
            else {
                System.out.println("Please input a proper command.");
            }
            

        }
    }

}