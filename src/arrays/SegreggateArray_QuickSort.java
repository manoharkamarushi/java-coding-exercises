package arrays;


import org.testng.annotations.Test;

public class SegreggateArray_QuickSort {
//	Pro tip: Partition is quicksort's heart 
//	- master it for sorting questions! 🔥
	
	// use quicksort partition
	// if ask is segregate around specific value k
	
	// int[] arr = { 4, 2, 7, 1, 3, 5 };
	// Output: Result: 1 2 3 4 7 5 
    // All <3 left, >=3 right ✓

//      Mental Notes:
//  	Partition K:
//		left=0, right=n-1
//		while(left <= right):
//		  arr[left] < K? → left++
//		  arr[right] >= K? → right--
//		  ELSE → swap(left++, right--)
//		return left  // Boundary position



	@Test()
	public void segregateAroundK() {

		int[] arr = { 4, 2, 7, 1, 3, 5 };
		int left = 0, right = arr.length - 1, k = 3;

		while (left <= right) {
			if (arr[left] < k) {
				left++;
			} else if (arr[right] >= k) {
				right--;
			} else {
				swap(arr, left, right);
				left++;
				right--;

			}
		}

	}
//	1. **Quicksort pivot partition** - Core algorithm step
//	2. **Segregate around threshold** - <K vs >=K
//	3. **Binary array generalization** - Instead of 0/1, use any K
//	4. **Top K elements** - Partition then take right side
//	5. **Find Kth smallest** - Quickselect algorithm
//
//	**Interview triggers:**
//	- "Move elements less than K to left"
//	- "Partition array around value"
//	- "Quicksort partition step"
//	- "All <K before >=K"


	private void swap(int[] arr, int i, int j) {
		int temp;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}