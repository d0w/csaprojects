import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 3, 0, 10};
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k+1]) {
                System.out.print(k + " " + arr[k] + " ");
            }
        }
    }
    //use csa awesome unit 7 for practice
}