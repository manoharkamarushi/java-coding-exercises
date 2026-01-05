package arrays;


public class secondlargestSmallestinArray {
	public static void main(String[] args) {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//		int largest = 0, secondLargest = 0; It will fail for arrays that contain only negative numbers.
		int largest = Integer.MIN_VALUE; // -2,147,483,648 smallest possible value in java.
		int secondLargest = Integer.MIN_VALUE;

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);
	}

	public void syntax_differentway() {

		int[] arr = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		System.out.println("The given array is:");
		for (int value : arr) {
			System.out.print(value + " ");
		}

		for (int value : arr) {
			if (value > largest) {
				// update both
				secondLargest = largest;
				largest = value;
			} else if (value > secondLargest && value < largest) {
				// update second largest only if smaller than largest
				secondLargest = value;
			}
		}
	}

	public void secondSmallest() {
		int[] arr = { 100, 14, 46, 47, 94, 52, 86, 36, 94, 89 };

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		System.out.print("Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num > smallest) {
				secondSmallest = num;
			}
		}
		
		System.out.println("\nSmallest number is: " + smallest);
        System.out.println("Second smallest number is: " + secondSmallest);
	}

}
