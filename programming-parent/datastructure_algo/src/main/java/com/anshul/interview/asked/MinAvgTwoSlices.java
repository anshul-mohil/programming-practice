package com.anshul.interview.asked;

/**
 * Question: https://codility.com/demo/take-sample-test/min_avg_two_slice
 * 
 * Question Name: MinAvgTwoSlice
 * 
 * The key to solve this task is these two patterns:
 * 
 * (1) There must be some slices, with length of two or three, having the
 * minimal average value among all the slices. (2) And all the longer slices
 * with minimal average are built up with these 2-element and/or 3-element small
 * slices.
 * 
 * Firstly we will prove the statement (1). In all the following discussion, we
 * assume the slices have two or more element. In every array, there must be at
 * lease one slice, to say S, having the Minimal Average (MA). And PLEASE PAY
 * ATTENTION, the following proof is done with the S, which HAS the global
 * minimal average.
 * 
 * If the length of S is two or three, it follows our conclusion. If the length
 * of S is odd, we could divide it into a 3-element sub-slice and some 2-element
 * sub-slice. For example, for the slice [1, 2, 3, 4, 5], we could get a
 * 3-element sub-slice [1, 2, 3] and a 2-element sub-slice [4, 5]. Or
 * differently we could get [1, 2] and [3, 4, 5]. But the split does not matter
 * in the following prove. If the sub-slices have different averages, some of
 * them will have smaller average than MA. But it conflicts with the condition
 * that, the MA is known as the global minimal average for all slices. By this
 * contradictory, it’s proved that all the sub-slices MUST have the same
 * average. If all the sub-slices have the same average, the average of them
 * must be MA. So all these sub-slices have overall minimal average and length
 * of two or three. If the length of S is even, we could divide it into some
 * 2-element sub-slice. For the slice [1, 2, 3, 4], the only possible split is
 * [1, 2] and [3, 4]. Then, similar with the previous case, all these 2-element
 * sub-slices have the global minimal average. And in the construction in step
 * b, we have already proven the statement (2).
 * 
 */
public class MinAvgTwoSlices {

	public static void main(String[] args) {
//		[1, 1, 1, 1, 1, 1, 1], 7
//		[1, 2, 2, 2, 2], 5
//		[1, 1, 1, 1, 2], 5
//		[1], 1
//		[], 0
//		[1, 2, 2, 2, 1], 5
//		[2, 2, 1], 3
//		[2, 1], 2
//		[1, 2], 2
//		[1, 2, 3, 4, 5], 2
		MinAvgTwoSlices obj = new MinAvgTwoSlices();
		int[] A =  {1, 1, 1, 1, 2};
	int value = obj.solution_3(A);
	System.out.println(value);
	}

	public int minAvgTwoSlices(int[] A) {
		double min_avg_value = (A[0] + A[1]) / 2.0; // The mininal average
		int min_avg_pos = 0; // The begin position of the first
		// slice with mininal average

		for (int index = 0; index < A.length-2; index++) {
			// Try the next 2-element slice
			if (((A[index] + A[index + 1]) / 2.0) < min_avg_value) {
				min_avg_value = (A[index] + A[index + 1]) / 2.0;
				min_avg_pos = index;
			}
			// Try the next 3-element slice
			if ((A[index] + A[index + 1] + A[index + 2]) / 3.0 < min_avg_value) {
				min_avg_value = (A[index] + A[index + 1] + A[index + 2]) / 3.0;
				min_avg_pos = index;
			}
		}
		// Try the last 2-element slice
		if (((A[A.length - 1] + A[A.length - 2]) / 2.0) < min_avg_value) {
			min_avg_value = (A[-1] + A[-2]) / 2.0;
			min_avg_pos = A.length - 2;
		}
		return min_avg_pos;
	}
	public int solution_3(int[] A) {
        int len = A.length, result = len - 1, sum = 0;
        int[] prefixSums = new int[len + 1];
 
        for (int i = 1; i <= len; ++i) {
            prefixSums[i] = prefixSums[i-1] + A[i-1];
        } 
 
        double min = Double.MAX_VALUE, average = 0d;
 
        for (int P = 0, Q = 1; Q + 1 < prefixSums.length; ++P, ++Q ) {
            sum = prefixSums[Q + 1] - prefixSums[P];
            average = (sum)/(double) 2;
 
            if (average < min) {
                min = average;
                result = P;
            } 
 
            if ( Q + 2 < prefixSums.length ) {
                sum = prefixSums[Q + 2] - prefixSums[P];
                average = (sum)/(double) 3;
 
                if (average < min) {
                    min = average;
                    result = P;
                } 
            } 
 
        } 
 
        return result;
    } 
	public int solution_2(int[] A) {
		if (A.length == 2)
			return 0;

		int minSliceTwo = A[0] + A[1];
		int minTwoIndex = 0;

		int minSliceThree = Integer.MAX_VALUE;
		int minThreeIndex = 0;

		for (int i = 2; i < A.length; i++) {
			int sliceTwo = A[i - 1] + A[i];
			if (sliceTwo < minSliceTwo) {
				minSliceTwo = sliceTwo;
				minTwoIndex = i - 1;
			}

			int sliceThree = sliceTwo + A[i - 2];
			if (sliceThree < minSliceThree) {
				minSliceThree = sliceThree;
				minThreeIndex = i - 2;
			}
		}
		int averageMinTwo = minSliceTwo * 3;
		int averageMinThree = minSliceThree * 2;

		if (averageMinTwo == averageMinThree)
			return Math.min(minTwoIndex, minThreeIndex);
		else
			return averageMinTwo < averageMinThree ? minTwoIndex : minThreeIndex;
	}
}
// def solution(A):
// min_avg_value = (A[0] + A[1])/2.0
// min_avg_pos = 0 # The begin position of the first
// # slice with mininal average
//
// for index in xrange(0, len(A)-2):
// # Try the next 2-element slice
// if (A[index] + A[index+1]) / 2.0 < min_avg_value:
// min_avg_value = (A[index] + A[index+1]) / 2.0
// min_avg_pos = index
// # Try the next 3-element slice
// if (A[index] + A[index+1] + A[index+2]) / 3.0 < min_avg_value:
// min_avg_value = (A[index] + A[index+1] + A[index+2]) / 3.0
// min_avg_pos = index
//
// # Try the last 2-element slice
// if (A[-1]+A[-2])/2.0 < min_avg_value:
// min_avg_value = (A[-1]+A[-2])/2.0
// min_avg_pos = len(A)-2
//
// return min_avg_pos