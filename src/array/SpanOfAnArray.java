package array;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - array
 * Created_on - April 19 - 2024
 * Created_at - 22:57
 */

public class SpanOfAnArray {

    public static void main(String[] args) {
        int[] array = {1,5,10,60,4,7,80,20,25,6};
//        int max = array[0];
//        int min = array[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max - min);
    }
}
