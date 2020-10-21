/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);

        //  Try other methods here:

        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        
        // Demonstrates difference between indexOf with one and two parameters
        int twoIndex = sample.indexOf("quick", 10);
        System.out.println("sample.indexOf(\"quick\", 10) = " + twoIndex);
        
        char letter = 'a';
        int code = (int) letter; //casting to integer to get unicode
        String letAsStr = String.valueOf(letter); //also gives unicode but in string
        System.out.println(code); //prints code
        System.out.println(letAsStr.compareTo("b"));
        
    }

}
