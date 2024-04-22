package array;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - array
 * Created_on - April 19 - 2024
 * Created_at - 23:09
 */

public class DigitsCounter {

    public static int getDigits(int n, int d) {
        int counter = 0;
        int sum = 0;

        while (n > 0) {
            int digit = n%10;
            n = n/10;

            if (digit != d) {
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int digit = 756575445;
        int d = 5;
        System.out.println(getDigits(digit, d));
    }
}
