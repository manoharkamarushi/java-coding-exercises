package arrays;


import java.util.Arrays;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class MergeTwoSortedArray {
	
	@Test
    public void ma1() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int i = 0, j = 0, k = 0;
        int[] merged = new int[arr1.length + arr2.length];

        // Merge elements in ascending order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) //If element from arr1 is smaller, copy it to merged.
                merged[k++] = arr1[i++]; 
            //Place that smaller element in merged[k].Then increment both k (merged index) and i (arr1 index).
            else
                merged[k++] = arr2[j++];
            //Otherwise, take the element from arr2.
//            Increment both k and j.
//            👉 Essentially, merge in sorted order by picking the smaller of two available elements.
        }

        // 📎 Copy remaining elements — from arr1
        //If arr2 finished first, but arr1 has remaining elements,copy them directly to the merged array.
        while (i < arr1.length)
            merged[k++] = arr1[i++];

        // Copy leftovers from arr2
        //Same logic: if arr1 ends first but arr2 still has leftover elements, append them too.

        while (j < arr2.length)
            merged[k++] = arr2[j++];

        System.out.print("Merged array: ");
        for (int num : merged)
            System.out.print(num + " ");
    }
	
	@Test
	public void mergesortarray_streams() {
	//“Using IntStream.concat() to merge both arrays into a single stream, then sorting and collecting 
	//back into an array gives a concise Stream-based solution. 
	//Though less optimal than two-pointers, it’s a great functional alternative.�?

    	
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

