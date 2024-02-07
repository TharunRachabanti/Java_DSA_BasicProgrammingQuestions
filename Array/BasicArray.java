package Array;
import java.util.Scanner;

public class BasicArray {

    // Method to print all elements of an array
    // Time complexity: O(n), where n is the number of elements in the array
    void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " "); // Printing each element of the array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;  // Declaring an Array
        arr = new int[10]; // Instantiating an Array

        System.err.println("Enter values for the array:");

        // Initializing the array with user input
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();  // Initializing each element of the array
        }

        BasicArray object = new BasicArray();
        System.err.println("The values in the array are:");
        object.printArray(arr); // Calling the method to print the array
    }   
}
