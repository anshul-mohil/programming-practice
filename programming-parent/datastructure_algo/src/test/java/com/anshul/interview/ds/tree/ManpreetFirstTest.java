package com.anshul.interview.ds.tree;

import org.junit.Assert;
import org.junit.Test;

import com.anshul.interview.ds.linkedlist.KthNodeFromEndOfList;
import com.anshul.interview.ds.linkedlist.Node;

public class ManpreetFirstTest {

	@Test
	public void test() {
		KthNodeFromEndOfList k = new KthNodeFromEndOfList();
		Node head = new Node(10);
		Node node = k.kthNodeFromEnd(head, 3);
		Assert.assertNull(node);	
		//Assert.assertNotNull("It is null", node);	
	}

}
