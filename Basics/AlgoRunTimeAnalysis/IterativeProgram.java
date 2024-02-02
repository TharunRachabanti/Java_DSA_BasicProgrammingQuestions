package Basics.AlgoRunTimeAnalysis;
import java.util.Scanner;

public class IterativeProgram {

    // Time Complexity: O(1)
    static int findLargestElement(int[] arr) { 
        int max = arr[0];  // -----O(1)
        for (int i = 1; i < arr.length; i++) {  // -----O(n)
            if (arr[i] > max) {   // -----O(1)
                max = arr[i];     // -----O(1)
            }
        }
        return max;  // -----O(1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        int largest = findLargestElement(arr);
        System.out.println("Largest number is: " + largest);
    }
}

// Total Time Complexity = O(1) + O(n) + O(1) + O(1) + O(1) = O(n + 3) = O(n)
