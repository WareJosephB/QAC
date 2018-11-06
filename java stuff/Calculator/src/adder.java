
public class adder {

	public static void main(String[] args) {
		System.out.println("Adding 1 and 2");
		System.out.println(add(1, 2));
		System.out.println("Minusing 3 from 5");
		System.out.println(minus(5, 3));
		System.out.println("Dividing 1 by 8");
		System.out.println(divide(1, 8));
		System.out.println("Multiplying 35 by 6");
		System.out.println(multiply(35, 6));

	}

	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public static int minus(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public static double divide(int firstNumber, int secondNumber) {
		double firstDouble = firstNumber;
		double secondDouble = secondNumber;
		return firstDouble / secondDouble;
	}

	public static int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
}
