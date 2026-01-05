package arrays;

// Time complexity O(n) 

//Given an integer array (can contain negative numbers),
//find three numbers whose product is maximum.

//The trick here is that the maximum product doesn’t necessarily come from the three largest numbers 
//— because two negatives can make a positive.

//“Keep top 3 biggest and bottom 2 smallest numbers.
//Max product = max( max1×max2×max3, min1×min2×max1 ).�?

//Interview variations you might face:
//-------------------------------------
//“Find the 3 numbers that give the maximum product (return the triplet itself).�?
//“Can you do it without sorting the array?�?
//“What is the time complexity?�?
//“What if the array has negative and positive numbers mixed?�?
//“How would you handle large numbers (integer overflow risk)? → use long.�?
public class maxProduct_Array_simple {
	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2 };

		if (arr.length < 3) {
			System.out.println("No triplets exists");
			return;
		}

		// O(n) solution: Track max1, max2, max3 and min1, min2, min3
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

		for (int num : arr) {
			// Update max3 numbers
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}

			// Update min3 numbers
			if (num < min1) {
				min3 = min2;
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min3 = min2;
				min2 = num;
			} else if (num < min3) {
				min3 = num;
			}
		}
		// Max product is either 3 largest OR 2 smallest * largest (for negatives)
		long product1 = (long) max1 * max2 * max3;
		long product2 = (long) min1 * min2 * max1;
		long maxProduct = Math.max(product1, product2);
		
//  Why two cases?
//	If all numbers are positive → largest³ wins.
//	If there are negatives → two negatives × one large positive may dominate.
		
		System.out.println("Max product triplet: {" + max1 + "," + max2 + "," + max3 + "} = " + product1);
		System.out.println("Or with negatives: {" + min1 + "," + min2 + "," + max1 + "} = " + product2);
		System.out.println("Final max: " + maxProduct);
	}
}
