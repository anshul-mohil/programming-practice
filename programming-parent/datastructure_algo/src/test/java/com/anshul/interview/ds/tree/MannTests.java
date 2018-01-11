package com.anshul.interview.ds.tree;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anshul.interview.ds.linkedlist.DoubleSortedLinkedList;

public class MannTests {
	private DoubleSortedLinkedList db = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		db = new DoubleSortedLinkedList();
	}

	@After
	public void tearDown() throws Exception {
	}
    
    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional[baeldung]", opt.toString());
    }
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
