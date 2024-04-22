package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - Java DSA
 * Package - PACKAGE_NAME
 * Created_on - April 19 - 2024
 * Created_at - 22:09
 */

public class JavaProgram {

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World");
//        System.out.print("Hello");
//        System.err.println("Error");
//        System.err.println("Hello \n \t World");
//
//        Scanner sc = new Scanner(System.in); //Most Basic
//        sc.nextInt(); // Integer
////        sc.next(); // Single String (Rohit Parihar)
//        sc.nextLine();
//
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        System.out.println(args.length);
    }
}
