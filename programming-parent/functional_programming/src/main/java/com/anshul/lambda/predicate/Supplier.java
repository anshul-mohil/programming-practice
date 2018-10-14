package com.anshul.lambda.predicate;

@FunctionalInterface
public interface Supplier<T> {
  public T get();
}
