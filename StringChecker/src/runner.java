
public class runner {

	public static void main(String[] args) {

		System.out.println("Is \"Venus\" the same as \"Earth\"?");
		System.out.println(compareToEarth("Venus"));
		System.out.println("Is \"Earth\" the same as \"Earth\"?");
		System.out.println(compareToEarth("Earth"));
		System.out.println("Is \"ArbitraryString\" the same as \"ArbitraryStringB\"?");
		System.out.println(compareStrings("ArbitraryString", "ArbitraryStringB"));
		System.out.println("Is \"ArbitraryString\" the same as \"ArbitraryString\"?");
		System.out.println(compareStrings("ArbitraryString", "ArbitraryString"));
	}

	static boolean compareToEarth(String maybeEarth) {

		return maybeEarth.equals("Earth");
	}

	static boolean compareStrings(String stringA, String stringB) {
		return stringA.equals(stringB);
	}

}
