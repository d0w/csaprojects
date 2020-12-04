
/**
 * Write a description of class RentalProperty here.
 *
 * @author Derek Xu
 * @version 11/30/2020
 */
public class RentalProperty
{
    //enum - enumerator - variable that is set to a set of constants
        // public enum Day {
        //     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        // }


     
        

    private enum PropertyType { SINGLEFAMILY, TOWNHOUSE, APARTMENT, UNKNOWN };
    private int[] propertyNumbers;
    private int[] bedrooms;
    private double[] bathrooms;
    private double[] monthlyRent;
    private PropertyType[] types;

    //constructor
    public RentalProperty() {
        //long way
        propertyNumbers = new int[8];
        propertyNumbers[0] = 654981;
        propertyNumbers[1] = 132564;
        propertyNumbers[2] = 965165;
        propertyNumbers[3] = 198719;
        propertyNumbers[4] = 987654;
        propertyNumbers[5] = 135468;
        propertyNumbers[6] = 648513;
        propertyNumbers[7] = 132582;

        bedrooms = new int[8];
        bedrooms[0] = 5;
        bedrooms[1] = 6;
        bedrooms[2] = 1;
        bedrooms[3] = 3;
        bedrooms[4] = 2;
        bedrooms[5] = 8;
        bedrooms[6] = 0;
        bedrooms[7] = 7;

        bathrooms = new double[8];
        bathrooms[0] = 3.5;
        bathrooms[1] = 2.0;
        bathrooms[2] = 2.0;
        bathrooms[3] = 3.0;
        bathrooms[4] = 4.5;
        bathrooms[5] = 1.0;
        bathrooms[6] = 2.5;
        bathrooms[7] = 1.0;

        monthlyRent = new double[8];
        monthlyRent[0] = 1234.00;
        monthlyRent[1] = 4534.54;
        monthlyRent[2] = 4786.54;
        monthlyRent[3] = 2478.11;
        monthlyRent[4] = 9786.00;
        monthlyRent[5] = 1324.00;
        monthlyRent[6] = 1234.00;
        monthlyRent[7] = 2541.00;
        
    }

    public void showListing() {
        //loop through varios arrays and print the data
        for (int i = 0; i < 8; i++) {
            System.out.println(propertyNumbers[i] + " " + PropertyType.SINGLEFAMILY + " " + bedrooms[i] + " " + bathrooms[i] + " " + monthlyRent[0]);
        }
    }





}
