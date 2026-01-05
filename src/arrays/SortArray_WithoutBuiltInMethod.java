package arrays;

public class SortArray_WithoutBuiltInMethod {
//On each pass, larger elements “bubble up” to the right.
//Each iteration moves the next largest element to its final position.
	
public void bubblesort() {
		int[] arr = {5, 2, 8, 3, 1};
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
//Find the smallest element in the unsorted part — swap it into place.
public void selectionsort() {
	   int[] arr = {5, 2, 8, 3, 1};
       int n = arr.length;
       
       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }

           // swap smallest with first unsorted element
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
       }

       System.out.print("Sorted array: ");
       for (int num : arr) {
           System.out.print(num + " ");
       }
       
}


//Not needed 
//“Take one element at a time and place it into its correct position among already sorted ones.”
public void insertionsort() {
	
	int[] arr = {5, 2, 8, 3, 1};

    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    System.out.print("Sorted array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
 }

}

