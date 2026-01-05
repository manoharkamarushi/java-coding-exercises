package arrays;


import org.testng.annotations.Test;

public class SegreggateArray {
// use two pointer approach [if arr has only 0,1 binary nos. as below]
// use dutch national algo [if arr has only 0,1,2] low=0 (for 0s), mid=0 (scan), high=n-1 (for 2s)

// Refer another file
// use quicksort partition [if ask is partition around specific value k]
// use Counting Sort [Any Values]
	
	@Test
	public void SegreggateZeros() {
		//two pointer approach
		int[] arr = {0, 1, 0, 1, 1, 1};
		int left = 0, right = arr.length - 1;
		
		while (left <= right) {
			if (arr[left] == 0) {// 0 is in correct position
                left++;  // go next
            } else if (arr[right] == 1) {// 1 is in correct position
                right--; // go back
            }else {
                // Swap 1 at left with 0 at right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
		}
	
		// Print result
        System.out.print("Array after segregation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: Array after segregation: 0 0 1 1 1 1 
		  
		
	}
	@Test()
	public void dutchNationaFlagAlgo() {
		
//		    Dutch Flag Swaps:
//			0 → swap(low++, mid++)    // Fix left, move both
//			2 → swap(mid, high--)     // Fix right, recheck mid  
//			1 → mid++                 // Skip (already correct)

		 int[] arr = {2, 0, 1, 1, 2, 0, 1};
		 int low = 0, mid = 0, high = arr.length - 1;
		 
		 while (mid <= high) {
	            if (arr[mid] == 0) {
	                swap(arr, low, mid);   // SWAP 0 to left
	                low++;
	                mid++;
	            } else if (arr[mid] == 2) {
	                swap(arr, mid, high);  // SWAP 2 to right
	                high--;
	                // DON'T increment mid - why?
	                // because after swap mid can be 0,checked in next iteration
	            } else {
	                mid++;  // 1 is correct, skip
	            }
	        }
		 
	}
	
	// SWAP LOGIC
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	
	@Test(enabled =false)
	//| Issue            | Problem                              | Impact                       |
	//| ---------------- | ------------------------------------ | ---------------------------- |
	//| 3 Passes         | Count zeros → Fill zeros → Fill ones | O(3n) = O(n) but inefficient |
	//| Multiple methods | segregate0and1() + print()           | Unnecessary abstraction      |
	//| No optimization  | Could do in 1 pass with two pointers | Missed interview opportunity |
	//| Mutable array    | Modifies input directly              | Side effects                 |
	
	// Not efficient
	// Use Two pointer way
	public void segregate0and1() {
		// Code to Segregate 0s and 1s in an array
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
		int n = arr.length;

		int count = 0; // counts the no of zeros in arr

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				count++;
		}

		// loop fills the arr with 0 until count
		for (int i = 0; i < count; i++)
			arr[i] = 0;

		// loop fills remaining arr space with 1
		for (int i = count; i < n; i++)
			arr[i] = 1;

		System.out.print("Array after segregation is ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
