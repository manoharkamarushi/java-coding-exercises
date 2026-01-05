package arrays;

import java.util.HashSet; 
import java.util.Set; 
  
public class commonInTwoArray{ 
	
//find common number b.w two arrays
// find un common number or missing number b.w two arrays
// store all elements in hashset for Array1
// and compare Array1 with Array2.
	
//why only hashset ?
// hashset - contains() is faster O(n) compared to others.
	
  
    // Function for finding elements which   
    // are there in a[] but not in b[].  
    static void findMissing(int a[], int b[],   
                     int n, int m)  
    {  
        // Store all elements of   
        // second array in a hash table  
        HashSet<Integer> s = new HashSet<>();  
        for (int i = 0; i < m; i++)  
            s.add(b[i]);  
        
        // Print all elements of first array  
        // that are not present in hash table  
        for (int i = 0; i < n; i++)  
            if (!s.contains(a[i])) 
                System.out.print(a[i] + " ");  
    }  
  
     public static void main(String []args){ 
          
        int a[] = { 1, 2, 6, 3, 4, 5 };  
        int b[] = { 2, 4, 3, 1, 0 };  
        int n = a.length;  
        int m = b.length;  
        findMissing(a, b, n, m); 
     } 
} 