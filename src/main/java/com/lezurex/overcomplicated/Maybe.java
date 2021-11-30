package com.lezurex.overcomplicated;

/**
 * @author Z-100
 * Did you ever want to just *maybe* decide something? Well here's the solution
 */
public class Maybe {

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
		return (int) Math.round(Math.random());
	}

	private static boolean returnNotFalse() {
		return !false;
	}

	private static boolean returnNotTrue() {
		return !true;
	}
}
