package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

/**
 * @author Z-100 Did you ever want to just *maybe* decide something? Well here's the solution
 */
@VeryUseful(theBecause = "Maybe it's good, maybe it's not.")
public class Maybe {

  private Maybe() {}

  public static boolean maybe() {
    switch (random()) {
      case 0 -> {
        return returnNotFalse();
      }
      case 1 -> {
        return returnNotTrue();
      }
      default -> System.exit(0);
    }
    return false;
  }

  private static int random() {
    return (int) java.lang.Math.round(Math.random());
  }

  private static boolean returnNotFalse() {
    return !false;
  }

  private static boolean returnNotTrue() {
    return !true;
  }
}
