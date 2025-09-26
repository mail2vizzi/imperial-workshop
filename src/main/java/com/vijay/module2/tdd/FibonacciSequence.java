package com.vijay.module2.tdd;

public class FibonacciSequence {

  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("negative index not supported");
    }
    if (i < 2) {
      return 1;
    }
    return term(i-2) + term(i-1);
  }
}
