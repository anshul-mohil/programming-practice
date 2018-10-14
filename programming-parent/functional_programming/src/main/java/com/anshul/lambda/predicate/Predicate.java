package com.anshul.lambda.predicate;

@FunctionalInterface
public interface Predicate<T> {

  public static <U> Predicate<U> isEqualsTo(U u) {
    return s -> s.equals(u);
  }

  public boolean test(T t);

  /**
   * When your method return the Functional interface
   * you need to return the implementation of the interface.
   */
  public default Predicate<T> and(Predicate<T> t) {
    // when you define lambda expression in return statement
    // you are not returning value of the defined method
    // you are returning the lambda Type ie. Predicate<T> in this case
    //(T p) -> this.test(p) this is the similiar statement in
    //Predicate<String> pre1 = x -> x.length() < 30; check what it is returning
    return (T p) -> this.test(p) && t.test(p);
  }

  public default Predicate<T> or(Predicate<T> t) {
    return p -> this.test(p) || t.test(p);
  }
}
