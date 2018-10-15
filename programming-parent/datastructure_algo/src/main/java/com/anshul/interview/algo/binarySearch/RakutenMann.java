package com.anshul.interview.algo.binarySearch;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class RakutenMann {
	/**
	 *  
	 * @param inputArray
	 * @return
	 * @throws ParserConfigurationException 
	 */
	public static int binarian(int[] inputArray){

		int[] count_arr = new int[10001];

		for (int i = 0; i < inputArray.length; i++)
			count_arr[inputArray[i]] += 1;

		for (int i = 0; i < count_arr.length; i++) {
			while (count_arr[i] > 1) {
				count_arr[i] -= 2;
				count_arr[i] += 1;
			}
		}
		
		int resultant_count = 0;
		for (int i = 0; i < count_arr.length; i++) {
			resultant_count += count_arr[i];
		}
		return resultant_count;
	}
	
	public static int GetMinimumSequence(int n) {
	    if (n <= 0) {
	       return -1;
	    } else if (n == 1) {
	        return 1;
	    } else if ((n % 2) == 1) {
	        return 1 + GetMinimumSequence(n - 1);
	    } else {
	        return 1 + Math.min(GetMinimumSequence(n - 1),
	                            GetMinimumSequence(n / 2));
	    }
	}
	public static void main(String[] args) {
		
	
		
		int[] input = { 0, 0, 0, 0, 1 };
		int[] input2 = { 10000, 1000, 1243, 353, 2533, 546, 235, 532, 235, 666, 666, 23, 26, 233, 2323, 23, 23 };
		int[] input3 = { 0 };
		int[] input4 = {};
		int[] input5 = { 1, 1, 1, 1 };
		int[] input6 = new int[] {10000,9999,9999,9999};
		int val = binarian(input);
		int val2 = binarian(input2);
		int val3 = binarian(input3);
		int val4 = binarian(input4);
		int val5 = binarian(input5);
		int val6 = binarian(input6);
		System.out.println();
	
		
	}
}
