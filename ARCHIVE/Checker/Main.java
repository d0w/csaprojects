import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//Difference between linear and binary
/*
 * Linear - Linear searches search from the start to the end of a list checking each element to see if it matches
 *  -only search that works on unsorted data
 *  -considerably longer and takes more iterations than binary search
 * Binary - Binary searches by dividing the data in half and searching the area where the expected val is greater or less than the checked value.
 *  -Repeat dividing the search area in half and checking the middle value until the value is found.
 *  -Faster but only works on sorted data.
 */

public class Main {
  public static void main(String[] args) {
    SpellChecker checker = new SpellChecker();

    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      if (checker.binarySpellCheck(word))
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
      scan.close();
  }
}