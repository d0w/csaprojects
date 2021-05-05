import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Derek Xu
 * @version 10/12/2020
 */
public class MagpieRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie maggie = new Magpie();
		MagpieEngine engine = new MagpieEngine();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();
		
		while (engine.findKeyword(statement, "bye") < 0)
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
