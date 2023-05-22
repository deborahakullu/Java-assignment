// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//1.	Write a Java program to swap 2 numbers.
import java.util.*;
//class Swap_With {
public class Main {
        public static void main(String[] args) {
            int x, y, t;// x and y are to swap
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of X and Y:");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("before swapping numbers: "+x +"  "+ y);
            /*swapping */
            t = x;
            x = y;
            y = t;
            System.out.println("After swapping: "+x +"   " + y);
            System.out.println( );

        }
    }
