
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;

/**
 * An array sorting demo class. This class can show an array of some elements, and 
 * implements a sort method. The sorting method (and, in fact, the array creation)
 * can be called interactively (by right-clicking on the world background) or by
 * running this scenario. Original version by Michael Kolling.
 */
public class ArrayVisualization extends World
{
    private Element[] a;        // the array being displayed
    private ArrayDisplay display; // the ArrayDisplay object for visualising a
    private int index = 0;

    /**
     * Create the demo world.
     */
    public ArrayVisualization()
    {    
        super(800, 500, 1);

        makeBarArray();
        //makeAnimalArray();
        getBackground().drawString(
            "Right-click to create a new array or sort",20, 40);
    }

    /**
     * Create and show an array made up of bars. The values in the array are random.
     * This method can be called from this class's constructor, or interactively 
     * (by right-clicking in the world background).
     */
    public void makeBarArray()
    {
        removeObjects(getObjects(null));  // remove all objects

        a = new Element[100];
        //generates random ints for each element in the array
        for (int i = 0; i < 100; i++) {
            a[i] = new Element(Greenfoot.getRandomNumber(256));
        }

        //Sets up the new display
        display = new ArrayDisplay(a);
        addObject (display, 400, 300);

        getBackground().setColor(new Color(200, 200, 200));
        getBackground().fill();
        Greenfoot.setSpeed(97);
    }

    /**
     * Create and show an array of some animals (randomly shuffled). This method can be 
     * called from this class's constructor, or interactively (by right-clicking in the 
     * world background).
     * Animals are created with a given value for their weight - this is the criterion
     * by which theu will be sorted.
     */
    public void makeAnimalArray()
    {
        removeObjects(getObjects(null));  // remove all objects

        ArrayList<Element> al = new ArrayList<Element>();

        al.add( new Element("bee.png",      1) );
        al.add( new Element("frog.png",     5) );
        al.add( new Element("hedgehog.png", 10) );
        al.add( new Element("lemur.png",    20) );
        al.add( new Element("pelican.png",  50) );
        al.add( new Element("pig.png",      200) );
        al.add( new Element("camel.png",    400) );
        al.add( new Element("elephant.png", 800) );
        Collections.shuffle(al);

        a = new Element[al.size()];
        a = al.toArray(a);

        display = new ArrayDisplay(a);
        addObject (display, 400, 300);

        setBackground("grass.jpg");
        Greenfoot.setSpeed(55);
    }

    /**
     * Performs a bubble sort on the array in the display. If you want to
     * animate algorithms like this (without the act loop), it is important
     * to call display.update() in the inner loop to trigger the array 
     * update animation on screen.
     */
    public void bubbleSort()
    {
        boolean swapped = true;

        while (swapped) 
        {
            swapped = false;
            for (int i = 0; i < a.length - 1; i++) 
            {
                if (a[i].getValue() > a[i+1].getValue()) 
                {
                    swap (i, i+1);
                    swapped = true;
                    display.update();
                }
            }
        }
    }

    public void selectionSort() {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j].getValue() < a[minIndex].getValue())
                {
                    minIndex = j;

                }
            }
            Element temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            display.update();
        }
        String c = Integer.toString(count);
        showText(c,50, 50);
    }

    //bubble compares side by side
    //selection compares values at certain indexes and moves values
    public void insertionSort() {
        int count = 0;
        for (int j = 1; j < a.length; j++) {
            Element temp = a[j];

            int possibleIndex = j;
            while (possibleIndex > 0 && temp.getValue() < a[possibleIndex - 1].getValue()) {
                a[possibleIndex] = a[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            a[possibleIndex] = temp;

        }
        String c = Integer.toString(count);
        showText(c,50, 50);

    }

    /*
    public static void mergeSort(int[] elements)
   {
      int n = elements.length;
      int[] temp = new int[n];
      mergeSortHelper(a, 0, n - 1, temp);
   }

   private void mergeSortHelper(int[] elements,
                                       int from, int to)
   {
       if (0 < a.length - 1)
       {
          int middle = (from + to) / 2;
          mergeSortHelper(a, 0, a.length/2, temp);
          mergeSortHelper(a, a.length/2 + 1, a.length - 1, temp);
          merge(a, 0, a.length / 2, a.length -1 , temp);
       }
   }

   public void merge(int[] elements, int from,
                             int mid, int to)
   {
      
      int i = 0;
      int j = a.length / 2 + 1;
      int k = 0;

      while (i <= a.length / 2 && j <= a.length - 1)
      {
         if (a[i].getValue() < a[j].getValue())
         {
            temp[k] = a[i].getValue();
            i++;
         }
         else
         {
            temp[k] = a[j].getValue();
            j++;
         }
         k++;
      }

      while (i <= a.length / 2)
      {
         temp[k] = a[i].getValue();
         i++;
         k++;
      }

      while (j <= to)
      {
         temp[k] = a[j].getValue();
         j++;
         k++;
      }

      for (k = from; k <= to; k++)
      {
         a[k].setValue(temp[k]);
      }
   }
   */
   public void mergeSort()
   {
      int n = a.length;
      Element[] temp = new Element[n];
      mergeSortHelper(a, 0, n - 1, temp);
      display.update();
      
   }

   public void mergeSortHelper(Element[] elements,
                                       int from, int to, Element[] temp)
   {
       if (from < to)
       {
          int middle = (from + to) / 2;
          mergeSortHelper(elements, from, middle, temp);
          mergeSortHelper(elements, middle + 1, to, temp);
          merge(elements, from, middle, to, temp);
       }
   }

   public void merge(Element[] elements, int from,
                             int mid, int to, Element[] temp)
   {
      int i = from;
      int j = mid + 1;
      int k = from;
      
      while (i <= mid && j <= to)
      {
         if (elements[i].getValue() < elements[j].getValue())
         {
            temp[k] = elements[i];
            i++;
         }
         else
         {
            temp[k] = elements[j];
            j++;
         }
         k++;
      }

      while (i <= mid)
      {
         temp[k] = elements[i];
         i++;
         k++;
      }

      while (j <= to)
      {
         temp[k] = elements[j];
         j++;
         k++;
      }

      for (k = from; k <= to; k++)
      {
         elements[k] = temp[k];
      }
   }
  


    /**
     * Swap the array elements at positions i1 and i2.
     */
    private void swap (int i1, int i2)
    {
        Element tmp = a[i1];
        a[i1] = a[i2];
        a[i2] = tmp;
    }
}
