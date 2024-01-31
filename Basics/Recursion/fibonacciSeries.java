package Basics.Recursion;

import java.util.Scanner;

public class fibonacciSeries {

   public static int fibonacci(int n) {
       if (n == 1 || n == 2) {
           return n - 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }

   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Enter a number: ");
           int n = scanner.nextInt();

           int fibonacciNumber = fibonacci(n);
           System.out.println("The Fibonacci number at position " + n + " is: " + fibonacciNumber);
       }
   }
}
