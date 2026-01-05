package arrays;

import java.util.*; 
  
import java.util.HashSet;
//Finding the first element that repeats in an array or list (classic interview question)
// Detecting the earliest duplicate ID in logs, user IDs, or transaction lists.
// Finding duplicate appears earliest.

public class FirstRepeatingElementInArray {

    // Print the first repeating element in arr[]
    static void printFirstRepeating(int arr[]) {
    	
        int minIndex = -1;   // -1 = not found yet
        // you can also initialize to 0 but it means element found at
        // index 0 which is ambigitous
        HashSet<Integer> set = new HashSet<>();

        // Traverse from right to left
//  Right → left + set = one pass, very simple logic, directly yields leftmost repeating element.
//	Left → right + set alone = only tells you about second occurrences, not the earliest, unless you add extra structures or extra pass.    
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                minIndex = i;    // update index of first repeating
            } else {
                set.add(arr[i]);
            }
        }

        if (minIndex != -1) {
            System.out.println("The first repeating element is " + arr[minIndex]);
        } else {
            System.out.println("There are no repeating elements");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }
}
