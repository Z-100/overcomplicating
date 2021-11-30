package com.lezurex.overcomplicated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Z-100
 * This test may or may not fail
 */
class MaybeTest {

	@Test
	void maybe() {
		assertTrue(Maybe.maybe());
		assertFalse(Maybe.maybe());
	}
}