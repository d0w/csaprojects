import java.util.Scanner;

static class GoGuess {
    public static void goGuess(int max) {
        int value = (int) Math.random() * max;
        Scanner s = new Scanner(System.in);
        boolean correct = false;
        int tries = 0

        System.out.println("Try a number between 0 and " + max 
                            + ". Decimals will be rounded");
        int input = (int) s.nextInt();
        s.nextLine();

        while(!correct) {
            if (input < value) {
                tries++;
                System.out.println("Too low. Try again")
                input = s.nextInt();
                s.nextLine();
            }
            else if (input > value) {
                tries++;
                System.out.println("Too high. Try again")
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
            else if (input == -1) {
                System.out.println("Exiting");
                break;
            }
            else {
                System.out.println("Please input a valid number")
            }
        }

    }

    public static void main(String[] args) {
        goGuess(5);
    } 
}