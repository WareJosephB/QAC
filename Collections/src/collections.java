import java.util.ArrayList;

public class collections {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(Array1to100()));
		// System.out.println(List100to999());
		System.out.println(MultiplyListBy10(List100to999()));
	}

	public static int[] Array1to100() {
		int[] numberArray = new int[100];
		for (int i = 1; i < 101; i++) {
			numberArray[i - 1] = i;
		}
		return numberArray;
	}

	public static ArrayList<Integer> List100to999() {
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int i = 100; i < 1000; i++) {
			numberList.add(i);
		}
		return numberList;
	}

	public static ArrayList<Integer> MultiplyListBy10(ArrayList<Integer> List) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i : List) {
			newList.add(i * 10);
		}
		return newList;
	}

}
