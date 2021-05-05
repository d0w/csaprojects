
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    //recursive method calls itself
    /*
    if (num == 1) {
    return 1;
    }
    else {
    return (num + getTriNum(num - 1));
    }
     */
    // base case is case where method will end itself
    //
    public static void main(String[] args) {
        String[] words = {"hi", "hello", "no", "yes", "owijefowiefj"};
        String a = findLongest(words, words.length);
        System.out.println(a);

    }

    public static String findLongest(String[] a, int end) {
        if (end == 1) {
            return a[0];
        }
        else {
            if (a[end].length() > a[end - 1].length()) {
                return findLongest(a, end - 1);
            }
            if (a[end].length() < a[end - 1].length()) {
                a[end - 1] = a[end];
                return findLongest(a, end - 1);
            }

        }
        return null;

    }

    public static String findLongest(String[] a, int end) {
        int index = 0; 
        int elementLength = a[0].length();
        for (int i = 1; i < end; i++) {
            if(a[i].length() > elementLength) {
                index = i; elementLength = a[i].length();
            }
        }

        return a[index];
    }
}
