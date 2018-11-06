
public class reverseString {

	public static void main(String[] args) {
		System.out.println("Butts");
		System.out.println(reverseString("Butts"));
		System.out.println(reverseString(reverseString("Butts")));
	}

	static String reverseString(String reversable) {
		int length = reversable.length();
		String[] letterArray = new String[length];
		String[] rightWay = reversable.split("");
		for (int i = 0; i < length; i++) {
			letterArray[i] = rightWay[length - (i + 1)];
		}
		;
		String reversed = String.join("", letterArray);
		return reversed;
	}

}
