public class advancedCalculator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(calculate(a, b, "add"));
		System.out.println(calculate(a, b, "minus"));
		System.out.println(calculate(a, b, "divide"));
		System.out.println(calculate(a, b, "multiply"));
	}

	public static int calculate(int firstNumber, int secondNumber, String operator) {
		switch (operator) {
		case "add":
			return firstNumber + secondNumber;
		case "minus":
			return firstNumber - secondNumber;
		case "multiply":
			return firstNumber * secondNumber;
		case "divide":
			return firstNumber / secondNumber;
		default:
			return 0;
		}
	}
}
