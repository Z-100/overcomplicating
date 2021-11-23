package com.lezurex.overcomplicated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Z-100
 */
class InkrementInteacherTest {

	@Test
	void plusOne() {
		assertEquals(0b10, InkrementInteacher.plusOne(0b1));
	}

	@Test
	void plusAny() {
		assertEquals(0b10, InkrementInteacher.plusAny(0b0, 0b10));
	}
}