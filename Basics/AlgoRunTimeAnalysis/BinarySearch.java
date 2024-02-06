package Basics.AlgoRunTimeAnalysis;
import java.util.Scanner;
public class BinarySearch {

    // This method performs binary search on a sorted array and returns the index of the required element if found, or 0 otherwise
    int BinaryExplore(int[] arr, int req, int first, int last) { // ---T(n)
        // Base case: the array has only one element
        if (first == last) { // ---O(1)
            // Check if the element matches the required value
            if (req == arr[first]) { // ---O(1)
                return first; // ---O(1)
            } else { // ---O(1)
                return 0; // ---O(1)
            }
        } else {
            // Find the middle index of the array
            int mid = findmid(arr, first, last); // ---O(1)

            // Compare the middle element with the required value
            if (arr[mid] < req) { // ---O(1)
                // Recursively search in the right half of the array
                return BinaryExplore(arr, req, mid + 1, last); // ---T(n/2)
            } else if (arr[mid] > req) { // ---O(1)
                // Recursively search in the left half of the array
                return BinaryExplore(arr, req, first, mid - 1); // ---T(n/2)
            } else {
                // The element is found at the middle index
                return mid; // ---O(1)
            }
        }
    }

    // This method returns the middle index of a given array and its start and end indices
    int findmid(int[] array, int start, int end) {
        int middle = (start + end) / 2;
        return middle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];
        System.out.println("Enter all eleven elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All eleven elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter an element to search");
        int req = sc.nextInt();
        int first = 0;
        int last = 10;
        BinarySearch object = new BinarySearch();
        int res = object.BinaryExplore(arr, req, first, last);
        System.out.println(res);
    }
}



// Time complexity of BinaryExplore method is 
//  T(n)= O(1)+T(n/2)
//  T(1)=1 base condition 
//  T(n/2)=T(n/4)+O(1)
//  T(n/4)=T(n/8)+O(1)        
//    
//   T(n)=T(n/4)+2
//   T(n)=T(n/8)+3
//            .
//            .
//   T(n)=T(n/2pow k)+k           n/2 pow k =1 
//                                2 pow k = n  
//                                log n 2 = k-- k = logn
//
//  T(n)=T(1)+logn
//  T(n)=O(1)+logn
//  T(n)=logn
