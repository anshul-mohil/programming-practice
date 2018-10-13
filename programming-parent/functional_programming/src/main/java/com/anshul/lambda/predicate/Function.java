package com.anshul.lambda.predicate;

@FunctionalInterface
public interface Function<T, R> {
  R apply(T t);
}

/**
 * @FunctionalInterface public interface Function<T, U, R> {
 * R apply(T t, U u);
 * }
 */