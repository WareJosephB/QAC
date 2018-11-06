package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void aTooBig() {
		Blackjack blackjack = new Blackjack();
		assertEquals(10, blackjack.play(22, 10));

	}

	@Test
	public void bTooBig() {
		Blackjack blackjack = new Blackjack();
		assertEquals(7, blackjack.play(7, 22));
	}

	@Test
	public void aBiggerNotTooBig() {
		Blackjack blackjack = new Blackjack();
		assertEquals(15, blackjack.play(15, 14));
	}

	@Test
	public void bBiggerNotTooBig() {
		Blackjack blackjack = new Blackjack();
		assertEquals(8, blackjack.play(3, 8));

	}

	@Test
	public void bothTooBig() {
		Blackjack blackjack = new Blackjack();
		assertEquals(0, blackjack.play(22, 22));
	}

}
