package com.anshul.interview.strings;

public class Rakuten {

	static int MAX = 10000;
	static int f[];
	
	public static int fib(int a, int b, int n) {
		// Base cases
		if (n == 0)
			return (f[n]=a);
		if (n == 1)
			return (f[n]=b);
		if (n == 2)
			return (f[n] = a + b);

		// If fib(n) is already computed
		if (f[n] != a)
			return f[n];

		int k = (n & 1) == 1 ? (n + 1) / 2 : n / 2;

		// Applyting above formula [Note value
		// n&1 is 1 if n is odd, else 0.
		f[n] = (n & 1) == 1 ? (fib(a, b, k) * fib(a, b, k) + fib(a, b, k - 1) * fib(a, b, k - 1))
				: (2 * fib(a, b, k - 1) + fib(a, b, k)) * fib(a, b, k);

		return f[n];
	}

	/**
	 *  
	 * @param inputArray
	 * @return
	 */
	public static int binarian(int[] inputArray) {

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

	/* Driver program to test above function */
	public static void main(String[] args) {
		f = new int[MAX];

//		int[] input = { 0, 0, 0, 0, 1 };
//		int[] input2 = { 10000, 1000, 1243, 353, 2533, 546, 235, 532, 235, 666, 666, 23, 26, 233, 2323, 23, 23 };
//		int[] input3 = { 0 };
//		int[] input4 = {};
//		int[] input5 = { 1, 1, 1, 1 };
//		int val = binarian(input);
//		int val2 = binarian(input2);
//		int val3 = binarian(input3);
//		int val4 = binarian(input4);
//		int val5 = binarian(input5);
//		
//		
//		int n = 9;
	//	System.out.println(fib(n));
		
		
		int a =3, b =4, num =5;
		int valFib = fib(a,b,num);
		System.out.println(valFib);
		
//		System.out.println("val1 : {0, 0, 0, 0, 1} " + " " + val);
//		System.out.println(
//				"val2 : {10000, 1000, 1243, 353, 2533, 546, 235, 532, 235, 666, 666, 23, 26, 233, 2323, 23, 23}  "
//						+ val2);
//		System.out.println("val3 : {0} " + val3);
//		System.out.println("val4 : {} " + val4);
//		System.out.println("val5 : {1, 1, 1, 1} " + val5);
	}

}
