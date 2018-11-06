package com.qa.BinaryPredicate;

public class BinaryPredicates {

	MathOperation subtraction = (a, b) -> a - b;

	MathOperation addition = (a, b) -> a + b;

	MathOperation multiplication = (a, b) -> a * b;

	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface StringOperation {
		String operation(String s);
	}

	public String operate(String s, StringOperation stringOperation) {

		return stringOperation.operation(s);

	}

}
