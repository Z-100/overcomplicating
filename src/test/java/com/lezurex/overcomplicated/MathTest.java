package com.lezurex.overcomplicated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

	@Test
	void isSquare() {
		assertTrue(Math.isSquare(1, 1));
		assertFalse(Math.isSquare(1, 2));
	}

	@Test
	void isNotSquare() {
		assertFalse(Math.isNotSquare(1, 1));
		assertTrue(Math.isNotSquare(1, 2));
	}

	@Test
	void random() {
		assertEquals(641, Math.random());
		assertNotEquals(642, Math.veryRandom());
	}

	@Test
	void veryRandom() {
		assertEquals(1127, Math.veryRandom());
		assertNotEquals(1128, Math.veryRandom());
	}

	@Test
	void notRandom() {
		assertEquals(1010, Math.notRandom());
		assertNotEquals(1011, Math.notRandom());
	}

	@Test
	void willPlusOneResultInAStackOverflowQuestionMark() {
		assertFalse(Math.willPlusOneResultInAStackOverflowQuestionMark(0x1.fffffffffffffP+1023 - 1));
	}

	@Test
	void one() {
		assertEquals(1.0, Math.one());
		assertNotEquals(-1.0, Math.one());
	}

	@Test
	void two() {
		assertEquals(2.0, Math.two());
		assertNotEquals(-1.0, Math.two());
	}

	@Test
	void three() {
		assertEquals(3.0, Math.three());
		assertNotEquals(-1.0, Math.three());
	}

	@Test
	void numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker() {
		assertTrue(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker(1));
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker("1"));
	}

	@Test
	void destroySkinWalkerWhichHidesAsANumber() {
		assertTrue(Math.destroySkinWalkerWhichHidesAsANumber(1));
	}

	@Test
	void numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt() {
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt("1"));
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt(1));
	}

	@Test
	void isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine() {
		assertTrue(Math.isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine(267630));
		assertFalse(Math.isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine(267627));
	}
}