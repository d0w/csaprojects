
/**
 * Write a description of class DepartmentStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DepartmentStore
{
    public static int[][] itemNumbers;
    public static String[][] itemNames;
    public static double[][] itemPrices;
    /**
     * 
     * @return 2x5 2d array of ints
     */
    public static void initList() {
        itemNumbers = new int[][] {
                        {123456, 124125, 734734, 315132, 262377},
                        {752352, 346347, 765634, 124235, 865474} };
        itemNames = new String[][] {
                        {"Blouse", "Skirt", "Rings", "Pants", "Shoes"},
                        {"Shirt", "Pants", "Boots", "Belt", "Shorts"} };

        itemPrices = new double[][] { 
                    {15.00, 10.00, 15.00, 20.00, 60.00},
                    {10.00, 20.00, 120.00, 50.00, 150.00} };
    }

    /**
     * @param the row
     * @param the column
     * @param 2d array printing from
     */
    public static void printSingleElement(int r, int c, int[][] list) {
        System.out.println(itemNumbers[r][c]);
    }
    /**
     * @param the row
     * @param the column
     * @param 2d array printing from
     */
    public static void printSingleElement(int r, int c, String[][] list) {
        System.out.println(itemNumbers[r][c]);
    }
    /**
     * @param the row
     * @param the column
     * @param 2d array printing from
     */
    public static void printSingleElement(int r, int c, double[][] list) {
        System.out.println(itemNumbers[r][c]);
    }

    /**
     * Prints all elements in a single list
     * @param one list
     */
    public static void printAllElements(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void printAllElements(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void printAllElements(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void printEntireStore() {
        System.out.println("Item Listing");
        System.out.println("======================================");
        System.out.println("Item#   Item Name       Price   ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < itemNumbers.length; i++) {
            for (int j = 0; j < itemNumbers[0].length; j++) {
                System.out.println(itemNumbers[i][j] + "\t" + itemNames[i][j] + "\t\t" + itemPrices[i][j]);
                //can use string formatting to solve issues
            }
            System.out.print("\n");
        }
    }





    public static void printAsterisks() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void thing() {
        int[][] myArray = { {1,2,3,4},{5,6,7,8} };

        for (int[] row : myArray) {
            for (int item : row) {
                //for each loop to loop through 2d array
                System.out.print(item);
            }
            System.out.print("\n");
        }
    }

    /**
     * Prints all elements in a single row
     * @param list - 2d array
     * @param i - start indexx
     * @param j - end index
     */
    public static void printRows(int i, int j, double[][] list) {
        for (int r = i; r <= j; r++) {
            for (int c = 0; c < list[r].length; c++) {
                System.out.print(list[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void printRows(int i, int j, String[][] list) {
        for (int r = i; r <= j; r++) {
            for (int c = 0; c < list[r].length; c++) {
                System.out.print(list[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void printRows(int i, int j, int[][] list) {
        for (int r = i; r <= j; r++) {
            for (int c = 0; c < list[r].length; c++) {
                System.out.print(list[r][c] + " ");
            }
            System.out.print("\n");
        }
    }


    




}
