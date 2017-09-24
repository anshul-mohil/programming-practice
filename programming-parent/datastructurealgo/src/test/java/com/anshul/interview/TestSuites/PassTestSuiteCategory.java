package com.anshul.interview.TestSuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.anshul.interview.ds.linkedlist.DoubleSortedLinkedListTest;
import com.anshul.interview.ds.linkedlist.KthNodeFromEndOfListTest;

@RunWith(Categories.class)
@Categories.IncludeCategory({GoodTestCategory.class})
@Categories.ExcludeCategory({BadTestCategory.class})
@SuiteClasses({ KthNodeFromEndOfListTest.class, DoubleSortedLinkedListTest.class})
public class PassTestSuiteCategory {


}