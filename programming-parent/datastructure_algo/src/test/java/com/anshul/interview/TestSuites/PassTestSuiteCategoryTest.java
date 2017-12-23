package com.anshul.interview.TestSuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import com.anshul.test.category.*;
import com.anshul.interview.ds.linkedlist.DoubleSortedLinkedListTest;
import com.anshul.interview.ds.linkedlist.KthNodeFromEndOfListTest;

@RunWith(Categories.class)
@Categories.IncludeCategory({GoodTestCategoryTest.class})
@Categories.ExcludeCategory({BadTestCategoryTest.class})
@SuiteClasses({ KthNodeFromEndOfListTest.class, DoubleSortedLinkedListTest.class})
public class PassTestSuiteCategoryTest {


}