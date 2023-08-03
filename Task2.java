/*
 2. Если необходимо, исправьте данный код:
 */
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {23, 56, 11, 8, 36, 45, 57, 0, 9};
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
     catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
     }
}}
