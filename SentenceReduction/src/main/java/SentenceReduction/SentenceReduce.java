package SentenceReduction;

import java.util.ArrayList;

public class SentenceReduce {

	public static void Reducer(String sentence) {

		String[] words = sentence.split(" ");

		int P = words.length - 1;
		int Q = 0;
		ArrayList<String> Holder = new ArrayList<>();

		while (Q < P - 1) {
			Holder.add(remover(words[Q], words[Q + 1]));
			Q += 1;
		}

		Holder.add(words[P]);
		System.out.println(String.join("", Holder));

	}

	public static String remover(String firstWord, String secondWord) {

		boolean test = false;

		int fW = firstWord.length() - 1;
		int sW = secondWord.length() - 1;

		String overlap = "";

		int fS = 0;
		int sS = 0;

		while (fS < fW && sS < sW && fS >= 0 && sS >= 0) {
			if (firstWord.charAt(fW - fS) == secondWord.charAt(sS)) {
				overlap = String.valueOf(secondWord.charAt(sS)).concat(overlap);
				sS -= 1;
				fS += 1;
			} else {
				sS += 1;
				fS = 0;
				overlap = "";
			}
			if (sS < 0) {
				test = true;
			}
		}

		if (test) {
			return firstWord.substring(0, fW + 1 - overlap.length());
		} else {
			return firstWord.concat(" ");
		}

	}

}