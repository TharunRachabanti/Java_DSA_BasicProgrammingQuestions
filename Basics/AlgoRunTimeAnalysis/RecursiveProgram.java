package Basics.AlgoRunTimeAnalysis;

import java.util.Scanner;

public class RecursiveProgram {

    static int biggest = Integer.MIN_VALUE; // Corrected declaration and initialization
    // This is a global variable, so it does not affect the time complexity of the method

    int largest(int[] arr, int n) {               // ---T(n)
        if (n == 0) {                  //---O(1)
            return biggest;            //---O(1)
        } else {                       //---O(1)
            if (arr[n-1] > biggest) {  //---O(1)
                biggest = arr[n-1];    //---O(1)
            }
            return largest(arr, n - 1);           //---T(n-1)
        }
    }
    // The time complexity of this method is T(n) = O(1) + T(n-1)
    // This is a recursive relation that can be solved by using the substitution method
    // T(n) = O(1) + T(n-1)
    //      = O(1) + O(1) + T(n-2)
    //      = O(1) + O(1) + O(1) + T(n-3)
    //      ...
    //      = O(1) + O(1) + ... + O(1) + T(0)
    //      = O(1) * n + T(0)
    //      = O(n) + O(1)
    //      = O(n)
    // Therefore, the time complexity of this method is O(n)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // The time complexity of creating a Scanner object is O(1)

        System.out.println("Enter size");
        int n = sc.nextInt();
        // The time complexity of printing a message is O(1)
        // The time complexity of reading an integer from the input is O(1)

        int[] arr = new int[n]; // Moved array declaration after getting the size
        // The time complexity of creating an array of size n is O(n)

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // The time complexity of printing a message is O(1)
        // The time complexity of the for loop is O(n), since it iterates n times
        // The time complexity of assigning an element to the array is O(1)
        // The time complexity of reading an integer from the input is O(1)
        // Therefore, the total time complexity of the for loop is O(n) * (O(1) + O(1)) = O(n)

        System.out.println("Entered numbers:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        // The time complexity of printing a message is O(1)
        // The time complexity of the for loop is O(n), since it iterates n times
        // The time complexity of accessing an element from the array is O(1)
        // The time complexity of printing an element is O(1)
        // Therefore, the total time complexity of the for loop is O(n) * (O(1) + O(1)) = O(n)

        RecursiveProgram program = new RecursiveProgram();
        // The time complexity of creating an object of the class is O(1)

        int large = program.largest(arr, n); // Corrected method invocation
        // The time complexity of calling the largest method is O(n), as we have calculated above

        System.out.println("largest number is " + large); // Corrected print statement
        // The time complexity of printing a message is O(1)
    }
}
// The total time complexity of the main method is the sum of the time complexities of each statement
// T(n) = O(1) + O(1) + O(n) + O(1) + O(n) + O(1) + O(n) + O(1) + O(n) + O(1)
//      = O(1) + O(n) + O(n) + O(n) + O(n)
//      = O(1) + 4 * O(n)
//      = O(n)
// Therefore, the time complexity of the main method is O(n)
