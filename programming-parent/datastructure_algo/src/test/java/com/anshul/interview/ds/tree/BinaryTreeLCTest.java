package com.anshul.interview.ds.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.anshul.interview.ds.trees.BinaryTreeLC;
import com.anshul.test.category.BadTestCategoryTest;
import com.anshul.test.category.GoodTestCategoryTest;
import com.anshul.interview.ds.trees.BinaryTreeLC.*;
import com.anshul.interview.ds.trees.NextRightPointer;

@Category({ GoodTestCategoryTest.class, BadTestCategoryTest.class })
public class BinaryTreeLCTest {

	private static BinaryTreeLCTest btLCTest = null;

	
	private static BinaryTreeLC binaryTreeLC = null;
	private static Node interviewBitTree = null;
	private static Node interviewBitTree2 = null;
	
	private static com.anshul.interview.ds.trees.NextRightPointer.Node nextRightPointerTree = null;
	private static NextRightPointer nextRightPointer = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		btLCTest = new BinaryTreeLCTest();
	}
	@Before
	public void setUp() throws Exception {
		binaryTreeLC = new BinaryTreeLC();
		interviewBitTree = btLCTest.CreacteInterviewBitTree(binaryTreeLC);
		interviewBitTree2 = btLCTest.CreacteInterviewBitTree2(new BinaryTreeLC());
		
		nextRightPointer = new NextRightPointer();
		nextRightPointerTree = BinaryTreeLCTest.CreateNextRightPointerTree(nextRightPointer);
	}
	
	@Category(GoodTestCategoryTest.class)
	@Test
	public void MinDepthTest() {
		System.out.println(" MinDepthTest running");
		assertEquals(3, binaryTreeLC.minDepth(interviewBitTree));
	}
	@Category(GoodTestCategoryTest.class)
	@Test
	public void MaxWidthTest() {
		System.out.println(" MaxWidthTest running ");
		assertEquals(3, binaryTreeLC.maxwidth(interviewBitTree));
	}
	@Category(GoodTestCategoryTest.class)
	@Test
	public void RootToLeafPathTest() {
		System.out.println(" RootToLeafPathTest running ");
		List<List<Integer>> actualList = binaryTreeLC.rootToLeafPath(interviewBitTree);
		List<List<Integer>> expectedList = helperPathSumTest();
		assertThat(actualList, is(expectedList));
	}
	@Category(GoodTestCategoryTest.class)
	@Test
	public void PathSumTest() {
		System.out.println(" PathSumTest running ");
		assertEquals(17, HelperPathSumTest());
	}

	@Category(GoodTestCategoryTest.class)
	@Test
	public void MaxDepthTest() {
		System.out.println(" MaxDepthTest running ");
		assertEquals(5, binaryTreeLC.maxDepth(interviewBitTree));
	}
	@Category(GoodTestCategoryTest.class)
	@Test
	public void NextRightPointerTest() {
		System.out.println(" NextRightPointerTest running ");
		assertNotNull( nextRightPointer.populateNextRightPointer());
	}
	@Category(GoodTestCategoryTest.class)
	@Test
	public void IsBTSameTest() {
		System.out.println(" IsBTSameTest running ");
		List l = IsBTSameTestHelper();

		assertTrue(binaryTreeLC.isBTSame((com.anshul.interview.ds.trees.BinaryTreeLC.Node) l.get(0),
				(com.anshul.interview.ds.trees.BinaryTreeLC.Node) l.get(1)));
	}
	private List<com.anshul.interview.ds.trees.BinaryTreeLC.Node> IsBTSameTestHelper(){
		List l = new LinkedList();
		BinaryTreeLC binaryTreeLC = new BinaryTreeLC();
		binaryTreeLC.root = binaryTreeLC.new Node(1);
		binaryTreeLC.root.left = binaryTreeLC.new Node(2);
		binaryTreeLC.root.right = binaryTreeLC.new Node(3);
		
		
		l.add(binaryTreeLC.root);
		
		BinaryTreeLC binaryTreeLC2 = new BinaryTreeLC();
		binaryTreeLC2.root = binaryTreeLC2.new Node(1);
		binaryTreeLC2.root.left = binaryTreeLC2.new Node(2);
		binaryTreeLC2.root.right = binaryTreeLC2.new Node(3);
		binaryTreeLC2.root.right.right = binaryTreeLC2.new Node(3);
		l.add((binaryTreeLC2.root));
		
		return l;
	}
	
	@Category(GoodTestCategoryTest.class)
	@Test
	public void Merge2BinaryTreesTest() {
		System.out.println(" Merge2BinaryTreesTest running ");
		com.anshul.interview.ds.trees.BinaryTreeLC.Node expected = Merge2BinaryTreesTestHelper(new BinaryTreeLC());
		assertNotNull( binaryTreeLC.merge2BinaryTrees(interviewBitTree, interviewBitTree2));
	}
	private com.anshul.interview.ds.trees.BinaryTreeLC.Node Merge2BinaryTreesTestHelper(BinaryTreeLC tree1){
		tree1.root = binaryTreeLC.new Node(105);
		tree1.root.left = binaryTreeLC.new Node(54);
		tree1.root.right = binaryTreeLC.new Node(308);
		tree1.root.left.left = binaryTreeLC.new Node(21);
		tree1.root.left.right = binaryTreeLC.new Node(70);
		

		tree1.root.left.left.left = tree1.new Node(7);
		tree1.root.left.left.right = tree1.new Node(5);
		tree1.root.left.left.right.left = tree1.new Node(2);

		tree1.root.right.left = tree1.new Node(13);
		tree1.root.right.right = tree1.new Node(4);

		tree1.root.right.right.right = tree1.new Node(1);
		return tree1.root;
	}
	private int HelperPathSumTest() {
		List<List<Integer>> actualList = binaryTreeLC.pathSum(interviewBitTree, 17);
		int value = 17;
		int currValue = 0;
		for (List<Integer> list : actualList) {
			for (Integer integer : list) {
				currValue += integer;
			}
			if (currValue != value)
				return 0;
			else
				currValue = 0;
		}
		return value;
	}

	private List<List<Integer>> helperPathSumTest() {
		List<List<Integer>> expectedList = new LinkedList<List<Integer>>();
		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(7);

		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(5);
		list2.add(4);
		list2.add(1);
		list2.add(5);
		list2.add(2);

		List<Integer> list3 = new LinkedList<Integer>();
		list3.add(5);
		list3.add(8);
		list3.add(13);

		List<Integer> list4 = new LinkedList<Integer>();
		list4.add(5);
		list4.add(8);
		list4.add(4);
		list4.add(1);
		// list4.add(2);

		expectedList.add(list);
		expectedList.add(list2);
		expectedList.add(list3);
		expectedList.add(list4);
		return expectedList;
	}

	private static Node CreacteInterviewBitTree2(BinaryTreeLC tree1) {
		 /* Creating following tree as First balanced BST
        100
        / \
       50 300
      / \
     20 70
*/
 
		tree1.root = binaryTreeLC.new Node(100);
		tree1.root.left = binaryTreeLC.new Node(50);
		tree1.root.right = binaryTreeLC.new Node(300);
		tree1.root.left.left = binaryTreeLC.new Node(20);
		tree1.root.left.right = binaryTreeLC.new Node(70);
		return tree1.root;
	}
	private static Node CreacteInterviewBitTree(BinaryTreeLC tree) {


		 /* Constructed binary tree is
	  
	         5
	        / \
	       4   8
	      /   / \
	     1  13   4
	    /  \      \
	   7    5      1
	       /
	      2	 
*/
		
		tree.root = tree.new Node(5);
		tree.root.left = tree.new Node(4);
		tree.root.right = tree.new Node(8);

		tree.root.left.left = tree.new Node(1);
		tree.root.left.left.left = tree.new Node(7);
		tree.root.left.left.right = tree.new Node(5);
		tree.root.left.left.right.left = tree.new Node(2);

		tree.root.right.left = tree.new Node(13);
		tree.root.right.right = tree.new Node(4);

		tree.root.right.right.right = tree.new Node(1);

		return tree.root;

	}

	public static com.anshul.interview.ds.trees.NextRightPointer.Node CreateNextRightPointerTree(NextRightPointer tree) {


		 /* Constructed binary tree is
	  
	         5
	        / \
	       4   8
	      /   / \
	     1  13   4
	    /  \      \
	   7    5      1
	       /
	      2	 
*/
		
		tree.root = tree.new Node(5);
		tree.root.left = tree.new Node(4);
		tree.root.right = tree.new Node(8);

		tree.root.left.left = tree.new Node(1);
		tree.root.left.left.left = tree.new Node(7);
		tree.root.left.left.right = tree.new Node(5);
		tree.root.left.left.right.left = tree.new Node(2);

		tree.root.right.left = tree.new Node(13);
		tree.root.right.right = tree.new Node(4);

		tree.root.right.right.right = tree.new Node(1);

		return tree.root;

	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		interviewBitTree = null;
		binaryTreeLC = null;
		btLCTest = null;
	}

	

	@After
	public void tearDown() throws Exception {
	}

}
