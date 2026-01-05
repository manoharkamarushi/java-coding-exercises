package arrays;

//What the code is trying to do
//rotate right: last two elements comes first [imaging rotating radio tuner]
//rotate left: first two elements comes last

//Example:
//Input → [1 2 3 4 5 6 7]
//Output→ [6 7 1 2 3 4 5], r = 2 [right rotate]
//Output- [3 4 5 6 7 1 2], r = 2 [left rotate]

//1.Reverse the whole array [7 6 5 4 3 2 1] reverse(arr, 0, n - 1);
//2.Reverse first r elements[6 7 5 4 3 2 1] reverse(arr, 0, r - 1);
//3.Reverse last n-r element[6 7 1 2 3 4 5] reverse(arr, r, n - 1);

// Left rotation
// reverse first r elements -> reverse n-r elements -> reverse whole.

//1. Reverse first r elements 	reverse(arr, 0, r - 1); 
//2. Reverse n-r elements 		reverse(arr, r, n - 1);
//3. Reverse whole array 		reverse(arr, 0, n - 1);
//System.out.print("Left rotation by " + r + ": ");

public class RotatebyN {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int r = 2;
		int n = arr.length;

		// Step 1: Reverse entire array
		reverse(arr, 0, n - 1);

		// Step 2: Reverse first r elements
		reverse(arr, 0, r - 1);

		// Step 3: Reverse remaining n - r elements
		reverse(arr, r, n - 1);

		// Print result
		System.out.print("Rotated Array: ");
		for (int num : arr)
			System.out.print(num + " ");

	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start]; //temp =a;
			arr[start] = arr[end]; //a=b;
			arr[end] = temp;//b=temp;
			start++; //increment since while loop
			end--;
		}
	}
}
