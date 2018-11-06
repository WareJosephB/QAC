
public class numberPrinter {

	public static void main(String[] args) {

		printUpToTen();
		printWords1to10();
		printWords1to999();

	}

	public static void printUpToTen() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	public static void print100to999() {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	}

	public static void printWords1to10() {
		String[] Words = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		for (String s : Words) {
			System.out.println(s);
		}
	}

	public static void printWords1to999() {
		String[] WeirdWords = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] Hundreds = { "Zero", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred",
				"Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred" };
		String[] Tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
				"Ninety " };

		for (int i = 1; i < 1000; i++) {
			if (i < 13) {
				System.out.println(WeirdWords[i - 1]);
			} else {
				int a = i % 10; // digits
				int b = (i % 100) / 10; // tens
				int c = (i - b) / 100; // hundreds
				if (a == 0 && b == 0) {
					System.out.println(Hundreds[c]);
				} else {
					if (c != 0) {
						System.out.print(Hundreds[c] + " and ");
					}
					if ((b * 10 + a) < 20) {
						System.out.println(WeirdWords[((b * 10) + a)]);
					} else {
						System.out.println(Tens[b] + WeirdWords[a]);
					}
				}
			}
		}
	}

}
