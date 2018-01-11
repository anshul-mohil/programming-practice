package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayMath {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int[] spiralOrder(final int[][] a) {

		int top = 0;
		int left = 0;
		int bottom = a.length - 1;
		int right = a[0].length - 1;
		int direction = 0;
		int array[] = new int[bottom + 1 * right + 1];
		int counter = 0;
		while (top < bottom && left < right) {
			if (direction == 0) {
				for (int i = left; i <= right; i++) {
					System.out.println(a[top][i]);
					array[counter++] = a[top][i];
				}
				top++;
				direction++;
			} else if (direction == 1) {
				for (int i = top; i <= bottom; i++) {
					System.out.println(a[i][right]);
					array[counter++] = a[i][right];
				}
				right--;
				direction++;
			} else if (direction == 2) {
				for (int i = right; i <= left; i--) {
					System.out.println(a[bottom][i]);
					array[counter++] = a[bottom][i];
				}
				bottom--;
				direction++;
			} else if (direction == 3) {
				for (int i = bottom; i <= top; i--) {
					System.out.println(a[i][left]);
					array[counter++] = a[i][left];
				}
				left++;
				direction = 0;
			}
		}
		return array;
	}

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
	}

	/**
	 * InterviewBit
	 * 
	 * @param a
	 * @return
	 */
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int i = 0;
		// remove zeroes at the front
		while (i < a.size() - 1 && a.get(i) == 0) {
			a.remove(i);
		}

		int carry = 1;
		int sum;
		for (i = a.size() - 1; i >= 0; i--) {
			sum = a.get(i) + carry;
			a.set(i, sum % 10);
			carry = sum / 10;

			// no need of further processing if carry is zero
			if (carry == 0) {
				break;
			}
		}
		// if carry is still left, add element at index 0,
		// it will shift all the elements to the right
		if (carry != 0) {
			a.add(0, carry);
		}
		return a;
	}

	/**
	 * Working and ready to upload
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
		int totalSteps = 0;
		for (int i = 1; i < a.size(); i++)
			totalSteps += Math.max(Math.abs(a.get(i) - a.get(i - 1)), Math.abs(b.get(i) - b.get(i - 1)));

		return totalSteps;
	}

	/**
	 * InterviewBit solution
	 * @param inputArray
	 * @return
	 */
	public ArrayList<Integer> plusOne_1(ArrayList<Integer> inputArray) {
		int zeroCounter = 0;
		while (zeroCounter < inputArray.size() && inputArray.get(zeroCounter) == 0)
			inputArray.remove(zeroCounter);

		int sum = 0, carry = 1;
		for (int i = inputArray.size() - 1; i >= 0; i--) {
			sum = inputArray.get(i) + carry;

			// set element
			inputArray.set(i, sum % 10);

			carry = sum / 10;

			// if carry == 0 means carry consumed
			if (carry == 0) {
				break;
			}
		}

		if (carry != 0)
			inputArray.add(0, carry);

		return inputArray;
	}

	public int maxSubArray(final List<Integer> arr) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);

			if (max < sum)
				max = sum;
			if (sum < 0)
				sum = 0;
		}
		return max;
	}

	/**
	 * InterviewBit working solution
	 * this solution is from geeksforgeeks intitially
	 * @param arr
	 * @return
	 */
	public int[] repeatedNumber(final int[] arr) {
		int size = arr.length;
		int[] r = new int[2];

		int i;
		// System.out.print("The repeating element is ");

		for (i = 0; i < size; i++) {
		//	System.out.print("some math    "+ (Math.abs(arr[i]) - 1)  + "      ");
			if (arr[Math.abs(arr[i]) - 1] > 0){
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
			else {
				r[0] = Math.abs(arr[i]);

				 System.out.println(Math.abs(arr[i]));
			}
		}

		// System.out.print("And the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0) {
				r[1] = i + 1;
				// System.out.println(i + 1);
			}
		}
		return r;
	}

	public static void main(String[] args) {
//		int[] a = new int[] { 8, 8, 8, 9 };
//		a = plusOne(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
ArrayMath a1 = new ArrayMath();
		// int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
       int arr[] = { 3,1,5,4,2,2 };
		int n = arr.length;
		a1.repeatedNumber(arr);

	}
}
