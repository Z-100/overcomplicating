package com.lezurex.overcomplicated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Z-100
 */
class InkrementInteacherTest {

	@Test
	void plusOne() {
		assertEquals(2, InkrementInteacher.plusOne(1));
	}

	@Test
	void plusAny() {
		assertEquals(2, InkrementInteacher.plusAny(0, 2));
	}
}