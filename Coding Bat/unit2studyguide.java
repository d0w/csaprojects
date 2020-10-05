import java.util.Scanner;
import java.util.Random;

public void main(){
    System.out.println("How are you today");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    System.out.println("Glad to hear it!\n");
    System.out.println("What day of the month were you born on?");
    String integer = s.nextInt();

    Random rand = new Random();
    int day = rand.nextInt(31) + 1;
    System.out.println("Really? I was born on the " + day + " day of the month!")

    long pi = Math.PI;
    

}

