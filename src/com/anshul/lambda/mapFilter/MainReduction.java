package com.anshul.lambda.mapFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class MainReduction {

	public static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction) {

		int result = valueIfEmpty;
		for (int value : values) {
			result = reduction.apply(result, value);
		}
		return result;
	}

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, -1, -2, -3, -4);

		List<Integer> ints1 = Arrays.asList(0, 1, 2, 3, 4);
		List<Integer> ints2 = Arrays.asList(-1, -2, -3, -4);

		BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1, i2);

		int reduction1 = reduce(ints1, 0, (i1, i2) -> Integer.max(i1, i2));
		int reduction2 = reduce(ints2, 0, op);
		int reduction = reduce(Arrays.asList(reduction1, reduction2), 0, op);
		// int reduction = reduce(ints, 0, op);

		System.out.println("Reduction : " + reduction2);
	}
}
