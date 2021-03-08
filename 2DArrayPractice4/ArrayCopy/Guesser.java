import java.util.Random;
import java.util.Scanner;
//random number
//asks the user for input
//Too low if guess is low
//too high if guess is too high
//game will end when the number is guessed correctly

class Guesser {
    public static void numGuess() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int number = rand.nextInt(10) + 1; 
        //generates numbers from 0-49 + 1
        boolean correct = false;

        System.out.println("Guess a number between 1-10. Answer 0 if you wish to end");
        while (correct != true) {
            int answer = scan.nextInt();

            if (answer == number) {
                correct = true;
                System.out.println("That was correct. The answer was: " + number);
            }
            else if (answer == 0) {
                System.out.println("Terminated");
                break;
            }
            else if (answer < number) {
                System.out.println("Guess is too low.");
            }
            else if (answer > number) {
                System.out.println("Guess is too high.");
            }
            

        }

    } 
}