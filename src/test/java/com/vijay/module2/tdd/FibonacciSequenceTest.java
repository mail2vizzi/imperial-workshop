package com.vijay.module2.tdd;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.vijay.module2.tdd.FibonacciSequence;

public class FibonacciSequenceTest {

  @Test
  public void definesFirstTwoTermsToBeOne() {
    assertThat(new FibonacciSequence().term(0), is(1));
    assertThat(new FibonacciSequence().term(1), is(1));
  }

  @Test
  public void hasEachTermTheSumOfPreviousTwo() {
    assertThat(new FibonacciSequence().term(2), is(2));
    assertThat(new FibonacciSequence().term(3), is(3));
    assertThat(new FibonacciSequence().term(4), is(5));
  }

  @Test
  public void isNotDefinedForNegativeIndices() {

    try {
      new FibonacciSequence().term(-1);
      fail("shouldhave thrown exception");
    } catch (IllegalArgumentException iae) {
      assertThat(iae.getMessage(), containsString("negative index"));
    }

  }

}
