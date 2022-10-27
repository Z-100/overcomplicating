/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Not everyone knows what hyphens mean")
public class IsIntegerNegative {

    private IsIntegerNegative() {}

    /**
     * Method used to check if an integer is negative
     *
     * @param input The input integer
     * @return the output depending on if the input integer is negative or not
     */
    public static boolean isNegative(int input) {
        char[] numberStringArray = (input + "").
                toCharArray();

        String numberString = new String(numberStringArray);

        char firstThing = numberString.charAt(0b0);

        if (firstThing == '-') {
            return !!returnTrue();
        } else {
            return !!returnFalse();
        }
    }

    /**
     * Method used to return true
     * @return true
     */
    private static boolean returnTrue() {
        return !false;
    }

    /**
     * Method used to return false
     * @return false
     */
    private static boolean returnFalse() {
        return !true;
    }
}
