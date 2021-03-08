
/**
 * Write a description of class Averages here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Averages
{
    // instance variables - replace the example below with your own
    private static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    public Averages() {
        int[][] newArr = new int[3][4];
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[j][i+1] = (arr[j][i-2] + arr[j][i-1] + arr[j][i]) / 3;
                }
            }
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[j][i];
            }
        }

        //alternate method
        /*for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0 , newArr[i], 0, 3);
            int average = 0;
            for (int j = 0; j < newArr[i].length - 1; j++) {
                average += newArr[i][j];
            }
            newArr[i][3] = average / arr[i].length;
        }
        */

        System.out.println("_________________");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " | ");
            }
            System.out.print("\n-----------------\n");
        }
    }
}

