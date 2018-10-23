package com.anshul.lambda.streams;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamTest {

  private static final Logger logger = Logger.getLogger(StreamTest.class.getName());
  StreamManipulation_Interview streamManipulation_interview;

  @Before
  public void setUp() throws Exception {
    streamManipulation_interview = new StreamManipulation_Interview();
  }

  @After
  public void tearDown() throws Exception {
    streamManipulation_interview = null;

  }

  @Test
  public void getListOfNameGreaterThanAge() {
    List<Student> list = setUpListOfStudent();
    List<String> listOfNameGreaterThanAge = streamManipulation_interview.getListOfNameGreaterThanAge(list, 29);

    listOfNameGreaterThanAge.forEach(i -> logger.info(i));
    assertEquals(3, listOfNameGreaterThanAge.size());

  }

  private List<Student> setUpListOfStudent() {
    List<Student> list = new ArrayList<>();
    list.add(new Student("anshul", 3204, 30));
    list.add(new Student("anukul", 3114, 28));
    list.add(new Student("Manpreet", 8899, 26));
    list.add(new Student("Amrik Singh", 7879, 45));
    list.add(new Student("Buggi", 8890, 41));
    return list;
  }
}