
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
        itemNumbers = new int[2][5];
        itemNames = new String[][] {
                        {"Blouse", "Skirt", "Earrings", "Pants", "Shoes"},
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



}
