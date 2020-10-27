import java.util.Scanner;

/**
 * Program that runs a number guessing game.
 *
 * @author Derek Xu
 * @version 10/26/2020
 */

public class GoGuess {
    public static void goGuess(int max) {
        int value = (int) ((Math.random() * max) + 1);
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        int tries = 0;

        System.out.println("Try a number between 1 and " + max 
                            + ". Decimals will be rounded");
        int input = (int) s.nextInt();
        s.nextLine();

        while(!correct) {
            if (input < value) {
                tries++;
                System.out.println("Too low. Try again");
                input = s.nextInt();
                s.nextLine();
            }
            else if (input > value) {
                tries++;
                System.out.println("Too high. Try again");
                input = s.nextInt();
                s.nextLine();
            }
            else if (input == value) {
                tries++;
                System.out.println("Right on");
                System.out.println("The number was " + value + " and it took you " 
                                    + tries + " tries");
                correct = true;
                break;
            }

        }

    }
}
