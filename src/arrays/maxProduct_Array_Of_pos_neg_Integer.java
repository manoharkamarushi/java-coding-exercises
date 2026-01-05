package arrays;

// Time complexity O(n3)

import java.util.*; 
//🕒 Complexity
//It’s O(n³) — fine for small arrays, but exponential if n grows.
//Brute‑force algo checks all possible triplets (i, j, k)

//Once you show this brute‑force version, you can easily say:
//“Now, this is an O(n³) solution; I can optimize to O(n) using the three‑max / two‑min tracking method.�?
// go back to maxProduct_Array_simple.java

public class maxProduct_Array_Of_pos_neg_Integer { 
      
    // Function to find maximum product pair 
    // in arr[0..n-1] 
    static void maxProduct(int arr[], int n) 
    { 
        if (n < 2) 
        { 
            System.out.println("No pairs exists"); 
            return; 
        } 
       
        // Initialize max product pair 
        int a = arr[0], b = arr[1], c=arr[2];
       
        // Traverse through every possible pair 
        // and keep track of max product 
        for (int i = 0; i < n; i++) 
          for (int j = i+1; j < n; j++) 
        	  for (int k = j+1; k < n; k++) 
             if (arr[i] * arr[j] * arr[k]> a * b * c){ 
                a = arr[i];  
                b = arr[j]; 
                c= arr[k];
             } 
               
        System.out.println("Max product pair is {" + 
                           a + "," + b + ","+ c +"}"); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {1, 4, 3, 2, -7, -2}; 
        int n = arr.length; 
        maxProduct(arr, n); 
              
    } 
} 
  