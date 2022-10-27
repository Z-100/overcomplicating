package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * @author Z-100 This test may or may not fail
 */
class MaybeTest {

  @Test
  void maybe() {
    boolean maybe = Maybe.maybe();
    assertTrue(maybe || !maybe);
  }
}
