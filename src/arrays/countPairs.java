package arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class countPairs {
	@Test
	public void countPairs() {
//	"I store the frequency of each unique number in a map.
//	Each pair requires two identical elements, so the number of pairs for that value is its frequency divided by 2.
//	I sum these up to get the total number of pairs.â€?
		
		int[] ary = { 1, 1, 1, 1, 1, 2, 2,3 };

		// Count frequency of each number
		Map<Integer, Integer> freq = new HashMap<>();
		for (int v : ary) {
			freq.put(v, freq.getOrDefault(v, 0) + 1);
		}
// freq = {1=3, 2=2, 3=1}
		
		int totalPairs = 0;
		for (int count : freq.values()) {
			totalPairs += count / 2;
		}
 // extracting pairs 
 // 3/2 = 1 pair
 // 2/2 = 1 pair
 // 1/2 = 0 pair
		
		System.out.println("Final total pairs = " + totalPairs);
	}
	
	@Test
	public void countPairs_Streams() {
//		â€œI streamed the array, grouped by each number using groupingBy(identity(), counting()) to get the frequency map.
//		Then, I took the frequency values stream and applied count / 2, summed them up to get total pairs using mapToLong().sum().â€?
		
		int[] ary = {1, 1, 1, 1, 1, 2, 2, 3};

        // Step 1: Stream the array and build frequency map
        Map<Integer, Long> freq = Arrays.stream(ary)
                .boxed() // convert int -> Integer
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
     // Step 2: Compute total pairs using stream of frequency values
        long totalPairs = freq.values().stream()
                .mapToLong(count -> count / 2) // each element forms count/2 pairs
                .sum();
        
       // Step 3: Print results
        System.out.println("Frequency map: " + freq);
        System.out.println("Final total pairs = " + totalPairs);
        
        
	}
}