package searching;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - searching
 * Created_on - April 22 - 2024
 * Created_at - 22:44
 */

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {10, 5, 6, 2, 7, 1, 25};
        int target = 2;
        System.out.println(linearSearch(array, target));
    }

    public static int linearSearch(int[] array, int target) {
        for (int i=0 ; i<array.length ; i++)
            if (array[i] == target) return i;
        return -1;
    }
}
