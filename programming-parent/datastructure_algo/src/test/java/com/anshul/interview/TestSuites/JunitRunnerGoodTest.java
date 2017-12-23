package com.anshul.interview.TestSuites;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import com.anshul.interview.ds.linkedlist.KthNodeFromEndOfListTest;
/**
 * This way you can call this class from script where this class might
 * be packaged in jar to execute test cases. This helps automating test
 * cases.
 * @author Explorer
 *
 */
public class JunitRunnerGoodTest {

	public static void main(String[] args) {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
	
		// you can not run test suits from here.
		//junit.run(LinkedListTestSuite.class);
		
		// junit runner only run classes have test method defined
		// it is running the test but not showing in Junit console next to package explorer
		
		
	//	junit.run(DoubleSortedLinkedListTest.class);
		junit.run(KthNodeFromEndOfListTest.class);
	}
}
