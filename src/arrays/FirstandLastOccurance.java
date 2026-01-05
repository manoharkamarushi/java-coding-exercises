package arrays;


import org.testng.annotations.Test;

// First and last occurrences of an number
// Searching an unsorted array 
// Finding first time and last time an event happend in log/time series analysis.

// Other ways
//â€œFind first and last occurrence of a target value.â€?
//â€œLocate start and end position of an element in a sorted array.â€?
//â€œReturn indices of first and last instance of keyâ€¯x.â€?
//â€œHow would you find total frequency using only one scan?â€?

public class FirstandLastOccurance {

	@Test
	public void m1() {
		int[] arr = { 1, 2, 2, 2, 2, 1, 4, 7, 8, 8 };
		int x = 1;

		int first = -1;
		int last = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				if (first == -1)
					first = i; // Capture the first occurrence
				last = i; // Keep updating; last is final seen index
			}
		}

		if (first == -1) {
			System.out.println(x + " not found");
		} else {
			System.out.println("First index: " + first);
			System.out.println("Last index: " + last);
		}
	}
}
