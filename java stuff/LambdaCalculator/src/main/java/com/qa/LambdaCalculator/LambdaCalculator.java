package com.qa.LambdaCalculator;

import java.util.function.BinaryOperator;

public class LambdaCalculator {

	public static void main(String[] args) {
		// System.out.println(compare.test("Earth", "Earth"));
		// System.out.println(compare.test("ArbitraryString", "ArbitraryString"));
		System.out.println(add.apply(1, 2));
		System.out.println(sub.apply(3, 10));
		System.out.println(calculator(3, 10, sub));
		System.out.println(calculator(1, 5, mul));

	}

	public static int calculator(int i1, int i2, BinaryOperator<Integer> operator) {
		return operator.apply(i1, i2);
	}

	// static BiPredicate<String, String> compare = (s1, s2) -> s1.equals(s2);
	static BinaryOperator<Integer> add = (n1, n2) -> n1 + n2;
	static BinaryOperator<Integer> sub = (n1, n2) -> n1 - n2;
	static BinaryOperator<Integer> mul = (n1, n2) -> n1 * n2;
	static BinaryOperator<Integer> div = (n1, n2) -> n1 / n2;

}
