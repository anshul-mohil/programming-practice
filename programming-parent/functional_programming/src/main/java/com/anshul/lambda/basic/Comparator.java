package com.anshul.lambda.basic;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

	public int compare(T t1, T t2);

	public default Comparator<T> thenComparing(Comparator<T> cmp) {

		return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
	}

	public default Comparator<T> thenComparing(Function<T, Comparable> f) {

		return thenComparing(comparing(f));
	}

	// <U> is an insertion of the generic type into the method. that defines
	// whatever the U type in parameter came will be applied as generic where
	// ever U
	// is used. ie. in return comparator will have U type of object.
	public static <U> Comparator<U> comparing(Function<U, Comparable> f) {

		return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
	}
	
	public static <U> Comparator<U> addingAge(Function<U, Comparable> f) {
		return (p1, p2) -> (Integer)f.apply(p1) + (Integer)f.apply(p2);
	}

}
