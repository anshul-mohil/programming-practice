package com.anshul.interview.ds.tree;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//import static org.hamcrest.CoreMatchers.allOf;
//import static org.hamcrest.CoreMatchers.anyOf;
//import static org.hamcrest.CoreMatchers.both;
//import static org.hamcrest.CoreMatchers.containsString;
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
//
//import java.util.Arrays;
//
//import org.hamcrest.core.CombinableMatcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.anshul.test.category.*;
import com.anshul.interview.ds.tree.util.*;

@Category({ GoodTestCategoryTest.class })
public class TreeUtilTest{

	static Object object = null;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		object = new TreeUtilTest();
		
	}

	@Test
	public void BinaryTreeTest() {
		System.out.println("Testing BinaryTree creation");
		BinaryTree bTree = createCompleteBinaryTree();
		
		assertNotNull(bTree);
		//TODO: NEED TO ADD MORE TEST CASES
	}
	@Test
	public void BinaryTreeHeightAltSolTest(){
		System.out.println("Testing Binary Tree height with alternative solution");
		BinaryTree bTree = createCompleteBinaryTree();		
		assertEquals(3, bTree.getHeightAlternativeSolution(bTree.root));
		

		assertEquals(-1, bTree.getHeightAlternativeSolution(null));
	
		BinaryTree bTree1Node = create1NodeTree();
		assertEquals(0, bTree.getHeightAlternativeSolution(bTree1Node.root));
	
	}
	
	@Test
	public void BinaryTreeHeightTest() {
		System.out.println("Testing BinaryTree getHeight method");
		BinaryTree bTree = createCompleteBinaryTree();		
		assertEquals(3, bTree.getBinaryTreeHeight(bTree.root));
		

		assertEquals(-1, bTree.getBinaryTreeHeight(null));
	
		BinaryTree bTree1Node = create1NodeTree();
		assertEquals(0, bTree.getBinaryTreeHeight(bTree1Node.root));
	}
	
	@Test
	public void BinaryTreeDiameter() {
		System.out.println("Testing Diameter of Binary Tree");
		BinaryTree bTree = createCompleteBinaryTree();	
		BinaryTree.Height h = new BinaryTree().new Height();
		h.h = 0;
		assertEquals(6, bTree.diameterOpt(bTree.root, h));
	}
	private BinaryTree create1NodeTree(){
		BinaryTree bTree = new BinaryTree(10);
		return bTree;
	}
	private static BinaryTree createCompleteBinaryTree() {
		   BinaryTree tree = new BinaryTree();
	 
		   /* following is the tree after above statement
			 
			           1
			         /   \
			       null  null    
          */
//	     ===============Level 0================
	        tree.root = new Node(1);
	 
/* 
			            1
			          /   \
			         2      3
			       /    \    /  \
			     null null null null 
 */
//	      ===============Level 1================
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
/*
			
					       1
					   /       \
					 2           3
				   /  \        /  \
				 4      5     6    7
			   /  \    / \
			  null    null null  null	
*/
//     ===============Level 2================
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
/*
		
					       1
					   /        \
					 2            3
				   /   \        /  \
				 4       5     6    7
			    /  \    / \
			   8    9 10  null	
*/
//===============Level 3================
		
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
	

		return tree;
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
}
