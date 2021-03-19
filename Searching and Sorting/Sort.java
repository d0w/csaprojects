
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public static void selection(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < elements.length; j++)
            {
                if (elements[j] < elements[min])
                {
                    min = j;
                    count++;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
        System.out.println(count + " iterations");
    }

    public static void insertion(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++)
        {
            int temp = elements[i];
            int possibleIndex = i;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(count + " iterations");
    }
}
