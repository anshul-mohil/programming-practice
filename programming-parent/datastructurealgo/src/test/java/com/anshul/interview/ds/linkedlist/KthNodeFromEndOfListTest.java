package com.anshul.interview.ds.linkedlist;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.anshul.interview.TestSuites.BadTestCategory;
import com.anshul.interview.TestSuites.GoodTestCategory;

@Category({GoodTestCategory.class, BadTestCategory.class})
public class KthNodeFromEndOfListTest {
	
	private static final Logger log = Logger.getLogger(KthNodeFromEndOfListTest.class);
	
	private Node<Integer> list1 = null;
	private KthNodeFromEndOfList testClassObject = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//	list1 = null;
	}

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		// setUp data into list1
		list1 = new Node<>(1);
		list1.next = new Node<Integer>(8);
		list1.next.next = new Node<Integer>(11);
		list1.next.next.next = new Node<Integer>(13);
		list1.next.next.next.next = new Node<Integer>(14);
		list1.next.next.next.next.next = new Node<Integer>(19);
		list1.next.next.next.next.next.next = new Node<Integer>(26);
		list1.next.next.next.next.next.next.next = new Node<Integer>(27);
		list1.next.next.next.next.next.next.next.next = new Node<Integer>(28);
		
		// creating object against test will be running
		testClassObject = new KthNodeFromEndOfList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category(GoodTestCategory.class)
	public void test() {

		Node<Integer> retreivedNode = testClassObject.kthNodeFromEnd(list1, 3);
		if (retreivedNode != null)
			log.info("So data present at kth index is " + retreivedNode.data);
		else {
			fail("kth index returned null so either the index is not present in the list or there is some problem in implementations");
			log.warn("kth index returned null so either the index is not present in the list or there is some problem"
					+ "in implementations");
		}
	}
	
	@Test
	@Category(BadTestCategory.class)
	public void failTest() {
		Node<Integer> retreivedNode = testClassObject.kthNodeFromEnd(null, 3);
		if(retreivedNode == null) {
			fail(" received "+ retreivedNode + " Node when passing null list to get element at 3");
			log.info(" Functionality working:  Test failed as expected");
		}
	}

}
