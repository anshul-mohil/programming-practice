package com.anshul.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MainBuildingStreams {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

		Stream<Integer> stream1 = ints.stream();
		Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);

		stream.forEach(System.out::println);
		System.out.println("==================");
		stream1.forEach(System.out::println);
		
		ints.stream().map(i -> i+2).filter(i -> i > 2).forEach( i -> System.out.println("----"+i));
		Stream<String> streamOfStrings = Stream.generate(() -> "one");
		streamOfStrings.limit(5).forEach(System.out::println);

		Stream<String> streamOfStrings2 = Stream.iterate("+", s -> s + "+");
		streamOfStrings2.limit(5).forEach(System.out::println);

		IntStream streamOfInt = ThreadLocalRandom.current().ints();
		streamOfInt.limit(5).forEach(System.out::println);
	}
}
