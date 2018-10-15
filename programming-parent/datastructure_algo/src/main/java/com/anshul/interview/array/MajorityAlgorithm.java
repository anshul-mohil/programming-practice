package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityAlgorithm {

	
	public List<Integer> majorityElement(int[] nums) {
		if (nums == null || nums.length == 0)
			return new ArrayList<Integer>();
		
		List<Integer> result = new ArrayList<Integer>();
		
		int candidate1 = nums[0], candidate2 = nums[0], candidate1Count = 0, candidate2Count = 0, len = nums.length;
		
		for (int i = 0; i < len; i++) {
			if (nums[i] == candidate1)
				candidate1Count++;
			else if (nums[i] == candidate2)
				candidate2Count++;
			else if (candidate1Count == 0) {
				candidate1 = nums[i];
				candidate1Count = 1;
			} else if (candidate2Count == 0) {
				candidate2 = nums[i];
				candidate2Count = 1;
			} else {
				candidate1Count--;
				candidate2Count--;
			}
		}
		candidate1Count = 0;
		candidate2Count = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == candidate1)
				candidate1Count++;
			else if (nums[i] == candidate2)
				candidate2Count++;
		}
		if (candidate1Count > len / 3)
			result.add(candidate1);
		if (candidate2Count > len / 3)
			result.add(candidate2);
		return result;
	}
	//https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
	/**
	 * 	candidate = 0
		count = 0
		for value in input:
  		if count == 0:
    	candidate = value
  		if candidate == value:
    	count += 1
  		else:
    	count -= 1
	 * @param nums
	 * @return
	 */
	 public List<Integer> nByKMajorityElement(int[] nums) {
	        int n = nums.length, k = 3;  //in this question, k=3 specifically
	        
	        List<Integer> result = new ArrayList<Integer>();
	        
	        if (n==0 || k<2) return result;
	       
	        int[] candidates = new int[k-1];
	        int[] counts = new int[k-1];
	       
	        
	        for (int num: nums) {
	            boolean settled = false;
	            for (int i=0; i<k-1; i++) {
	                if (candidates[i]==num) {
	                    counts[i]++;
	                    settled = true;
	                    break;
	                } 
	            }
	            if (settled) continue;
	            for (int i=0; i<k-1; i++) {
	                if (counts[i]==0) {
	                    counts[i] = 1;
	                    candidates[i] = num;
	                    settled = true;
	                    break;
	                } 
	            }
	            if (settled) continue;
	            for (int i=0; i<k-1; i++) counts[i] = (counts[i] > 0) ? (counts[i]-1) : 0;
	        }
	        
	        Arrays.fill(counts, 0);
	        for (int num: nums) {
	            for (int i=0;i<k-1; i++) {
	                if (candidates[i]==num) {
	                    counts[i]++;
	                    break;
	                }
	            }
	        }
	        for (int i=0; i<k-1; i++) if (counts[i]>n/k) result.add(candidates[i]);
	        return result;
	    }
}
