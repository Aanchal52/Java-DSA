package basics;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - PACKAGE_NAME
 * Created_on - April 19 - 2024
 * Created_at - 22:46
 */

public class NestedLoops {

    public static void main(String[] args) {
//        for (int i = 0 ; i<5 ; i++) { //Outer Loop
//            System.out.print("i = " + i + " -> ");
//            for (int j = 0 ; j<5 ; j++) {
//                System.out.print(" " + j);
//            }
//            System.out.println();
//        }

        for (int i = 0 ; i<5 ; i++) { //Outer Loop
            System.out.print("i = " + i + " -> ");
            for (int j = i ; j<5 ; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
