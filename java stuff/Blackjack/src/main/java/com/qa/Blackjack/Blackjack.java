package com.qa.Blackjack;

/**
 * Hello world!
 *
 */
public class Blackjack {
	public int play(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		}
		if (a > 21) {
			return b;
		}
		if (b > 21) {
			return a;
		}
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}
}
