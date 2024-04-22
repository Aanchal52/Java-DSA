package searching;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - searching
 * Created_on - April 22 - 2024
 * Created_at - 23:06
 */

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > target) high = mid - 1;
            if (array[mid] < target) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7));
    }
}
