package com.qa.ArrayListExercises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AppAsStreams {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		System.out.println(numbers);
		System.out.println(onlyEvens(numbers));
		System.out.println(mutlipliedByTen(numbers));
		System.out.println(max(numbers));
		System.out.println(min(numbers));
		System.out.println(squareList(numbers));
		// System.out.println(squareUniques(numbers));

	}

	public static List<Integer> onlyEvens(List<Integer> target) {
		List<Integer> solution = target.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		return solution;
	}

	public static List<Integer> mutlipliedByTen(List<Integer> target) {
		List<Integer> solution = target.stream().map(i -> 10 * i).collect(Collectors.toList());
		return solution;
	}

	public static int max(List<Integer> target) {
		IntSummaryStatistics step = target.stream().mapToInt((i) -> i).summaryStatistics();
		int solution = step.getMax();
		return solution;
	}

	public static int min(List<Integer> target) {
		IntSummaryStatistics step = target.stream().mapToInt((i) -> i).summaryStatistics();
		int solution = step.getMin();
		return solution;
	}

	public static List<Integer> squareList(List<Integer> target) {
		List<Integer> solution = target.stream().map(i -> i * i).collect(Collectors.toList());
		return solution;
	}

}
