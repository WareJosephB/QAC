package com.qa.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		System.out.println(numbers);
		System.out.println(onlyEvens(numbers));
		System.out.println(MultipliedByTen(numbers));
		System.out.println(max(numbers));
		System.out.println(min(numbers));
		System.out.println(squareList(numbers));
		System.out.println(squareUniques(numbers));
	}

	public static List<Integer> onlyEvens(List<Integer> target) {

		List<Integer> solution = new ArrayList<>();

		for (int i : target) {
			if (i % 2 == 0) {
				solution.add(i);
			}
		}
		return solution;
	}

	public static List<Integer> MultipliedByTen(List<Integer> target) {
		List<Integer> solution = new ArrayList<>();
		for (int i : target) {
			solution.add(10 * i);
		}
		return solution;
	}

	public static int max(List<Integer> target) {
		int a = 0;
		for (int i : target) {
			if (i > a) {
				a = i;
			}
		}
		return a;
	}

	public static int min(List<Integer> target) {
		int a = 100;
		for (int i : target) {
			if (i < a) {
				a = i;
			}
		}
		return a;
	}

	public static List<Integer> squareList(List<Integer> target) {
		List<Integer> solution = new ArrayList<>();
		for (int i : target) {
			solution.add(i * i);
		}
		return solution;
	}

	public static List<Integer> uniqueSquares(List<Integer> target) {
		List<Integer> solution = new ArrayList<>();
		for (int i : target) {
			if (!(solution.contains(i * i))) {
				solution.add(i * i);
			}
		}
		return solution;
	}

	public static List<Integer> squareUniques(List<Integer> target) {
		List<Integer> solution = new ArrayList<>();
		for (int i : target) {
			int n = 0;
			for (int m = 0; m < target.size(); m++) {
				if (target.get(m) == i) {
					n++;
				}
			}
			if (n == 1) {
				solution.add(i * i);
			}

		}
		return solution;
	}
}
