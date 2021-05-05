
/**
 * Write a description of class Search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Search
{
    static int[] arr = {1, 2, 4, 6, 9, 12, 15, 20};
    public static void binarySearchOne(int check, int[] arr) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check < arr[mid]) {
                right = mid - 1;
                count++;
            }
            else if (count > arr[mid]) {
                left = mid + 1;
                count++;
            }
            else if (count == arr[mid]) {
                System.out.println(check + " was found at index " + left + " " + right);
                System.out.println(count);
                break;
            }
            else {
                System.out.println(count);
                System.out.println(check + " was not found");
                break;
            }
        }

    }

    public static void binarySearch(int[] arr, int check) {
        int index = 0;
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < check) {
                left = mid + 1;
                count++;
            } else if (arr[mid] > check) {
                right = mid - 1;
                count++;
            } else if (arr[mid] == check) {
                index = mid;
                count++;
                break;
            }
            if (left > right) {
                System.out.println(check + " was not found");
                break;
            }
        }
        if (left <= right) {
            System.out.println(check + " was found at index " + index + " and took " + count + " times.");
        }
    }

    public static int binarySearchRecursive(int[] arr, int check, int start, int end){

        int mid = (start + end)/2;

        if(end < start){
            return -1;
        } 

        if (check < arr[mid]){
            return binarySearchRecursive(arr, check, start, mid - 1);
        }

        if (check > arr[mid]){
            return binarySearchRecursive(arr, check, mid + 1, end);
        }

        if (check == arr[mid]){
            return mid;
        }

        return -1;
    }

    public static int linearSearch(int[] arr, int check) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == check) {
                count++;
                index = i;
                System.out.println(check + " was found at index " + index + " and took " + count + " times.");
                return index;
            }
        }
        System.out.println(check + " was not found");
        return -1;

    }
}
