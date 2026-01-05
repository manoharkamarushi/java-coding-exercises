package arrays;


import java.util.*;
import java.util.stream.*;
//“Using IntStream.concat() to merge both arrays into a single stream, then sorting and collecting 
//back into an array gives a concise Stream-based solution. 
//Though less optimal than two-pointers, it’s a great functional alternative.�?

public class MergeTwoSortedArray_Streams {
	
    public static void main(String[] args) {
    	
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Step 1: Merge both arrays into one stream
        int[] merged = IntStream
                .concat(Arrays.stream(arr1), Arrays.stream(arr2)) // combine streams
                .sorted()                                         // sort combined data
                .toArray();                                       // return as int[]

        // Step 2: Print result
        System.out.println("Array after merging: " + Arrays.toString(merged));
    }
}
