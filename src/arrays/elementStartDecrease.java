package arrays;


import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

// Find elements starts decreasing in given array.
// Finding peak element
// Detect where trend changes from increasing to decreasing.

public class elementStartDecrease {

	@Test
	public void main1() {

		int midx = 0;
		int arr[] = new int[] { 0, 1, 2, 3, 2, 1 };

		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] > arr[i + 1]) {
				midx = i;
				break;
			}
		System.out.println("The element is: " + midx);

	}

	@Test
	public void streams() {
//		“I used IntStream.range to iterate over indices, 
//		applied a filter to detect where the next element becomes smaller, 
//		and used findFirst() to get the first decreasing point"		

		int[] arr = { 0, 1, 2, 3, 2, 1 };

		OptionalInt midx = IntStream.range(0, arr.length - 1)
				.filter(i -> arr[i] > arr[i + 1]) // where trend flips
				.findFirst(); // get first such index

		System.out.println(midx.isPresent() ? "Trend change starts at index: " + midx.getAsInt() : "No decreasing trend found");
// “IntStream for looping int values or array indices, 
//	OptionalInt Used when my stream operation (like findFirst() or max()) might not return value, to handle Null pointer exceptions”
		
	}

}
