package Basics.Recursion;
import java.util.Scanner;

public class factorial {

    // Recursive method to calculate factorial
    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();

        // Using the method to calculate factorial
        int result = calculateFactorial(m);

        // Printing the result
        System.out.println("Factorial of " + m + " is: " + result);
    }
}
