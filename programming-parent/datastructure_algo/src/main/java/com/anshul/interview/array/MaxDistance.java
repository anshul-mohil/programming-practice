package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MaxDistance {

	/* Utility Functions to get max and minimum of two integers */
	int max(int x, int y) {
		return x > y ? x : y;
	}

	int min(int x, int y) {
		return x < y ? x : y;
	}

	/*
	 * For a given array arr[], returns the maximum j-i such that arr[j] >
	 * arr[i]
	 */
	int maxIndexDiff(int A[]) {
		int maxDiff;
		int i, j;

		int len = A.length;
		int RMax[] = new int[len];
		int LMin[] = new int[len];

		/*
		 * Construct LMin[] such that LMin[i] stores the minimum value from
		 * (arr[0], arr[1], ... arr[i])
		 */
		LMin[0] = A[0];
		for (i = 1; i < len; ++i)
			LMin[i] = min(A[i], LMin[i - 1]);

		/*
		 * Construct RMax[] such that RMax[j] stores the maximum value from
		 * (arr[j], arr[j+1], ..arr[n-1])
		 */
		RMax[len - 1] = A[len - 1];
		for (j = len - 2; j >= 0; --j)
			RMax[j] = max(A[j], RMax[j + 1]);

		/*
		 * Traverse both arrays from left to right to find optimum j - i This
		 * process is similar to merge() of MergeSort
		 */
		i = 0;
		j = 0;
		maxDiff = -1;
		while (j < len && i < len) {
			if (LMin[i] <= RMax[j]) {
				maxDiff = max(maxDiff, j - i);
				j = j + 1;
			} else
				i = i + 1;
		}

		return maxDiff;
	}

	/* Driver program to test the above functions */
	public static void main(String[] args) {
		MaxDistance max = new MaxDistance();
		// max distance between big and its adjcent small... don't confuse with
		// smallest and largest
		int arr[] = { 18, 2, 1, 4, 5, 6, 17, 8, 3, 0 };
		int n = arr.length;
		int maxDiff = max.maxIndexDiff(arr);
		System.out.println(maxDiff);
	}

	/**
	 * Interview Bit solution
	 * 
	 * @param a
	 * @return
	 */
	public int maximumGap(final List<Integer> a) {
		int maxDiff;
		int i, j;
		int n = a.size();

		int[] LMin = new int[n];
		int[] RMax = new int[n];

		/*
		 * Construct LMin[] such that LMin[i] stores the minimum value from
		 * (arr[0], arr[1], ... arr[i])
		 */
		LMin[0] = a.get(0);
		for (i = 1; i < n; ++i)
			LMin[i] = Math.min(a.get(i), LMin[i - 1]);

		/*
		 * Construct RMax[] such that RMax[j] stores the maximum value from
		 * (arr[j], arr[j+1], ..arr[n-1])
		 */
		RMax[n - 1] = a.get(n - 1);
		for (j = n - 2; j >= 0; --j)
			RMax[j] = Math.max(a.get(j), RMax[j + 1]);

		/*
		 * Traverse both arrays from left to right to find optimum j - i This
		 * process is similar to merge() of MergeSort
		 */
		i = 0;
		j = 0;
		maxDiff = 0;
		while (j < n && i < n) {
			if (LMin[i] <= RMax[j]) {
				maxDiff = Math.max(maxDiff, j - i);
				j = j + 1;
			} else
				i = i + 1;
		}

		return maxDiff;
	}

	// public TreeNode abc(TreeNode A){
	// if(A==null)
	// return null;
	//
	// Stack<TreeNode> evenStack = new Stack<TreeNode>();
	// Stack<TreeNode> oddStack = new Stack<TreeNode>();
	// evenStack.push(A);
	//
	// ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>();
	//
	// while(!evenStack.isEmpty() || !oddStack.isEmpty())
	// {
	//
	// ArrayList<Integer> evenLevel = new ArrayList<Integer>();
	// while(!evenStack.isEmpty())
	// {
	// TreeNode node = evenStack.pop();
	// evenLevel.add(node.val);
	//
	// if(node.left !=null)
	// oddStack.push(node.left);
	//
	// if(node.right !=null)
	// oddStack.push(node.right);
	// }
	// if(evenLevel.size()>0)
	// main.add(evenLevel);
	//
	// ArrayList<Integer> oddLevel = new ArrayList<Integer>();
	//
	// while(!oddStack.isEmpty())
	// {
	// TreeNode node = oddStack.pop();
	// oddLevel.add(node.data);
	//
	// if(node.right !=null)
	// evenStack.push(node.right);
	//
	// if(node.left !=null)
	// evenStack.push(node.left);
	// }
	// if(oddLevel.size()>0)
	// main.add(oddLevel);
	// }
	// return main;
	// }
	//
	// }

	public int maximumGap(ArrayList<Integer> A) {
		if (A.isEmpty() || A.size() < 2) // check if array is empty or
											// small sized
			return 0;

		Collections.sort(A); // sort the array

		int maxGap = 0;

		for (int i = 0; i < A.size() - 1; i++)
			maxGap = Math.max(A.get(i + 1) - A.get(i), maxGap);

		return maxGap;
	}

	/**
	 * LeetCode nlogn complexity
	 * 
	 * @param intervals
	 * @return
	 */
	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	// https://leetcode.com/problems/merge-intervals/solution/
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

		Collections.sort(intervals, new IntervalComparator());

		LinkedList<Interval> merged = new LinkedList<Interval>();
		for (Interval interval : intervals) {
			// if the list of merged intervals is empty or if the current
			// interval does not overlap with the previous, simply append it.
			if (merged.isEmpty() || merged.getLast().end < interval.start) {
				merged.add(interval);
			}
			// otherwise, there is overlap, so we merge the current and previous
			// intervals.
			else {
				merged.getLast().end = Math.max(merged.getLast().end, interval.end);
			}
		}

		// return merged;
		return new ArrayList<>(merged);
	}

	private class IntervalComparator implements Comparator<Interval> {
		@Override
		public int compare(Interval a, Interval b) {
			return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
		}
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	
	List<Interval> result = new ArrayList<>();
    int i = 0;
    // add all the intervals ending before newInterval starts
    while (i < intervals.size() && intervals.get(i).end < newInterval.start)
        result.add(intervals.get(i++));
    // merge all overlapping intervals to one considering newInterval
    while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
        newInterval = new Interval( // we could mutate newInterval here also
                Math.min(newInterval.start, intervals.get(i).start),
                Math.max(newInterval.end, intervals.get(i).end));
        i++;
    }
    result.add(newInterval); // add the union of intervals we got
    // add all the rest
    while (i < intervals.size()) result.add(intervals.get(i++)); 
    return (ArrayList<Interval>) result;
	}	
}