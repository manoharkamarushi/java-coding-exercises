package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class countCommonpairs {
    public static void main(String[] args) {

        int[] ary = {1, 1, 1, 1, 1, 2, 2};

        // Count frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : ary) {
        	
            freq.put(v, freq.getOrDefault(v, 0) + 1);
        }

        int totalPairs = 0;

        // For each number, number of pairs = count / 2
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
        	
            int count = e.getValue();
            int pairs = count / 2;
            totalPairs += pairs;
            
            System.out.println(e.getKey() + " occurs " + count +
                               " times → pairs: " + pairs);
        }

        System.out.println("Final total pairs = " + totalPairs);
    }
}