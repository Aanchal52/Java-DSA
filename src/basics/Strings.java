package basics;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - PACKAGE_NAME
 * Created_on - April 19 - 2024
 * Created_at - 22:21
 */

public class Strings {

    public static void main(String[] args) {
        String a = "Rohit";
        //String b = "Rohit"
        String b = new String("Rohit");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
    }
}
