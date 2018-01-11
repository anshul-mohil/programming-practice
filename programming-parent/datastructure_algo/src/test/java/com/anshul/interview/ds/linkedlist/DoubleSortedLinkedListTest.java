package com.anshul.interview.ds.linkedlist;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.anshul.test.category.*;

//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.allOf;
//import static org.hamcrest.CoreMatchers.anyOf;
//import static org.hamcrest.CoreMatchers.both;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.everyItem;
//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.hamcrest.CoreMatchers.not;
//import static org.hamcrest.CoreMatchers.sameInstance;
//import static org.hamcrest.CoreMatchers.startsWith;
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNotSame;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertSame;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;


@Category({GoodTestCategoryTest.class})
public class DoubleSortedLinkedListTest {
	private static DoubleSortedLinkedList object = null;
	private Node<Integer> newNode = null;
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
	@Category(GoodTestCategoryTest.class)
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
		
		// because of static import on Assert you can call these methods as your own
		assertArrayEquals(testData,actualData);
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

	
	
	
	//#############################
	
	
	@Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }

	  @Test
	  public void testAssertEquals() {
	    assertEquals("failure - strings are not equal", "text", "text");
	  }

	  @Test
	  public void testAssertFalse() {
	    assertFalse("failure - should be false", false);
	  }

	  @Test
	  public void testAssertNotNull() {
	    assertNotNull("should not be null", new Object());
	  }

	  @Test
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  public void testAssertNull() {
	    assertNull("should be null", null);
	  }
	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame("should be same", aNumber, aNumber);
	  }

	  // JUnit Matchers assertThat
	  @Test
	  public void testAssertThatBothContainsString() {
	    assertThat("albumen", both(containsString("a")).and(containsString("b")));
	  }

	  @Test
	  public void testAssertThatHasItems() {
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	  }

	  @Test
	  public void testAssertThatEveryItemContainsString() {
	    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	  }

	  // Core Hamcrest Matchers with assertThat
	  @Test
	  public void testAssertThatHamcrestCoreMatchers() {
	    assertThat("good", allOf(equalTo("good"), startsWith("good")));
	    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
	    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
	    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
	    assertThat(new Object(), not(sameInstance(new Object())));
	  }

	  @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	  }
}
