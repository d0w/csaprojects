import java.util.Scanner;

/**
 * Rap names name generator - makes a random rap name based on your input.
 *
 * @author Derek Xu/Paris Wei
 * @version 10/07/2020
 */
public class NameGenerator
{
    /**
     * Gathers input
     */
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    
    /**
     * @param String firstname, String lastname
     * Generates random first name.
     */
    public String genFirstName(String first, String last) {
        String a = first.substring(3);
        String b = last.substring(0,2);
        return ("'Lil " + a + b);
    }
    
    /**
     * @param String city, String school
     * Generates random last name.
     */
    public String genLastName(String city, String school) {
        String a = city.substring(0, 1);
        String b = school.substring(3);
        if (b.length() < 4) {
            return (a + school);
        }
        return (a + b);
    }
    
    /**
     * @param String relative
     * @param String friend
     * Generates random origin
     */
    public String genOrigin(String relative, String friend) {
        int x = (int) (Math.random()*(relative.length() - 1) + 1);
        String a = relative.substring(x);
        int y = (int) (Math.random()*(friend.length() - 1) + 1);
        String b = friend.substring(y);
        return (a+b);
    }
    
    public void main() {
        System.out.println("Welcome to the name generator");
        System.out.println("Please respond with only characters");
        
        System.out.println("\n Please provide me with some info");
        System.out.println("First name");
        String firstName = getInput();
        System.out.println("Last Name");
        String lastName = getInput();
        System.out.println("City you were born in");
        String city = getInput();
        System.out.println("Previous school you attended");
        String school = getInput();
        System.out.println("First name of relative");
        String relative = getInput();
        System.out.println("First name of friend");
        String friend = getInput();
        
        //input for origin
        String first = genFirstName(firstName, lastName);
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        String last = genLastName(city, school);
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String origin = genOrigin(relative, friend);
        origin = origin.substring(0,1).toUpperCase() + origin.substring(1).toLowerCase();
        
        System.out.println("What's up " + first + " " + last + " of " + origin);
        
    }
}
