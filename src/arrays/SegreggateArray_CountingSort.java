package arrays;


import org.testng.annotations.Test;
//	**Mental Checklist:**
//	1. Fixed range [0,k]? → COUNTING SORT
//	2. count[num]++ → Frequency pass
//	3. while(count[i]-->0) → Reconstruct pass  
//	4. Time: O(n + k), Space: O(k)
//	5. Stable: YES (maintains order)
//
//	**Pro Tips:**
//	- Range 0-9 → int[10]
//	- Range 1-100 → int[100]  
//	- Negatives → count[num + 1000] (Use OFFSET to make all positive:)
//	- Strings → count['a'-'z'] or ASCII

//	**Edge cases:**
//	{[], [5], duplicates, all same, range extremes}


//	**Interview Gold:**
//	"Counting sort is O(n+k) when range is small!
//	Better than O(nlogn) comparison sorts - quick sort, merge sort."

//	Perfect for "sort small range" questions - always mention first in interviews! 🔥
//	Usage trigger: "Array contains only digits 0-9" → Instantly think Counting Sort
//	Unknown / large / negative keys → use HashMap.

public class SegreggateArray_CountingSort {
//Goal: Count frequency of each number, then rebuild array in sorted order.

	@Test
	public void countSort() {
		
		int[] arr = { 1, 4, 1, 2, 4, 3, 2, 1, 0 };
		// Step 1: Count frequency (assuming 0-9 range)
		
		int[] count = new int[10]; // 0 to 9
		
		for (int num : arr) {
			count[num]++; // count[1]++, count[4]++, etc.
		}
//		count = [1, 3, 2, 1, 2, 0, 0, 0, 0, 0]
//		value   0  1  2  3  4  ...
// 		0 appears 1 time, 1 appears 3 times, 2 appears 2 times,3 appears 1 time, 4 appears 2 times


// Step 2: Rebuild original arr with sorted counts
// This loop places each number exactly as many times as 
// it appears in the original array.
		
		int idx = 0;                     // Start writing from index 0 in the original array
		for (int i = 0; i < 10; i++) {   // Go through each possible number (0 ... 9)
		    while (count[i]-- > 0) {     // While count[i] is greater than 0
		        arr[idx++] = i;          // Place i in the array, then move to next index
		    }
		}
//The inner loop (while) 
//repeats each number as many times as it appeared in the original array (using the count array).
//idx++ ensures each value is placed into the next position sequentially.

		// Result: [0, 1, 1, 1, 2, 2, 3, 4, 4]
		System.out.print("Sorted: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	@Test(enabled =false)
	public void countSortWithNegatives() {
		 int[] arr = {-1, 0, 2, -1, 1, -2, 2};
	        
	        // Range: -2 to 2 → 5 values → array size 5
	        // Offset = 2 (smallest negative's absolute value)
		 
	        int[] count = new int[5];  // indices 0 to 4 represent -2 to 2
	        
	        // Count frequencies with offset
	        for (int num : arr) {
	            count[num + 2]++;  // -2→0, -1→1, 0→2, 1→3, 2→4
	        }
	        // count = [1, 2, 1, 1, 2]  (-2:1, -1:2, 0:1, 1:1, 2:2)
	        
	        // Rebuild sorted array
	        int idx = 0;
	        for (int i = 0; i < 5; i++) {
	            while (count[i]-- > 0) {
	                arr[idx++] = i - 2;  // Convert back: 0→-2, 1→-1, etc.
	            }
	        }
	        
	        // Result: [-2, -1, -1, 0, 1, 2, 2]
	        System.out.print("Sorted: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}