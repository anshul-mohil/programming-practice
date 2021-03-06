package org.functional_programming;


import com.anshul.lambda.basic.MainComparator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class AppTest {
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {

  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {

  }


  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void givenNonNull_whenCreatesNullable_thenCorrect() {
    // String name = "baeldung";
    String name = null;
    Optional<MainComparator> opt = Optional.ofNullable(null);
    System.out.println(opt.isPresent());
//    assertEquals("Optional[baeldung]", opt.toString());
  }

}
