package com.anshul.interview.ds.linkedlis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anshul.interview.ds.linkedlist.DoubleSortedLinkedList;
import com.anshul.interview.ds.linkedlist.Node;

public class DoubleSortedLinkedListTest {
	private static DoubleSortedLinkedList object = null;
	private Node newNode = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		object = new DoubleSortedLinkedList();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		object = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void doubleSortedLinkedListPassCase() {
		passCaseSetup();
		int[] testData = {1,19,20,21,32,41};
		int[] actualData = new int[6];
		int i = 0;
		while(newNode != null) {
			System.out.println("  "+ newNode.data + "  --");
			actualData[i++] = (int)newNode.data;
			newNode = newNode.next;
		}
		Assert.assertArrayEquals(testData,actualData);
	}
	private void passCaseSetup() {
		newNode = object.sortedInsert(null, 21);
		newNode = object.sortedInsert(newNode, 20);
		newNode = object.sortedInsert(newNode, 32);
		newNode = object.sortedInsert(newNode, 19);
		newNode = object.sortedInsert(newNode, 41);
		newNode = object.sortedInsert(newNode, 1);
		System.out.println(" sortedInsert pass case setup");
		System.out.println();
	}

}
