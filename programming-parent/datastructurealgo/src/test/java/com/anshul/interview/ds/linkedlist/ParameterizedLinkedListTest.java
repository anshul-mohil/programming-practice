package com.anshul.interview.ds.linkedlist;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step1: make class runwith Parameterized
@RunWith(Parameterized.class)
public class ParameterizedLinkedListTest {

	private static final DoubleSortedLinkedList object = new DoubleSortedLinkedList();
	private int[] input;
	private int[] expectedOutput;

	// step 2: create consturctor to take input stub data and expected output data
	public ParameterizedLinkedListTest(int[] input, int[] output) {
		this.input = input;
		this.expectedOutput = output;
	}

	// Step 3: what ever the list i will return,
	// from each list entry this class constructor will be called and then test
	// method.
	@Parameters
	public static List<Object[]> cookingSomeData() {
		return Arrays.asList(
				new Object[][] { 
					{ new int[] { 19, 21, 20, 32, 41, 1 }, new int[] { 1, 19, 20, 21, 32, 41 } }, 
					{ null, null }, 
				    {new int[] {2,1,4,3},new int[] {1,2,3,4}},
				});
	}

	@Test
	public void test() {
		   int[]  actualOutput = parseListToArray(getSortedLInkedList(input));
		   if(actualOutput != null)
			   actualOutput = Arrays.copyOfRange(actualOutput, 0, expectedOutput.length);

		
		Assert.assertArrayEquals(expectedOutput, actualOutput);
	}
	/**
	 * Test helpers
	 * @param list
	 * @return
	 */
	private static int[] parseListToArray(Node list) {
		if (list == null)
			return null;
		int[] array = new int[100];
		int i = 0;
		while (list != null) {
			array[i++] = (int) list.data;
			list = list.next;
		}
		return array;
	}

	/**
	 * Test helpers
	 * @param arr
	 * @return
	 */
	private static Node getSortedLInkedList(int[] arr) {
		if(arr == null || arr.length == 0 )
			return null;
		Node list = object.sortedInsert(null, arr[0]);
		for (int i = 1; i < arr.length; i++) {
			list = object.sortedInsert(list, arr[i]);
		}
		return list;
	}
}