package arrays;



public class pairElements {
	// Java implementation of 
	// simple method to find 
	// print pairs with given sum. 

		// Returns number of pairs 
		// in arr[0..n-1] with sum 
		// equal to 'sum' 
		static void printPairs(int arr[], 
							int n, int sum) 
		{ 
			// int count = 0; 

			// Consider all possible pairs 
			// and check their sums 
			int count=0;
			for (int i = 0; i <= n; i++) {
				for (int j = i + 1; j < n; j++) {
				//if (i+1<n-1)
					if (arr[i] + arr[j] == sum) {
						count++;
						System.out.println("(" + arr[i] + ", " + arr[j] + ")");}}}
			System.out.println(count);
			
		} 

		// Driver Code 
		public static void main(String[] arg) 
		{ 
			int arr[] = { 1, 5, 7, -1, 5 }; 
			int n = arr.length; 
			int sum = 6; 
			printPairs(arr, n, sum); 
		} 
	} 

