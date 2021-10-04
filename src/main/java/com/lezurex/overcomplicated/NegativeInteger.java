/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

public class NegativeInteger {

    /**
     * Method used to invert an integer. But bad
     *
     * @param input The input integer
     * @return The output integer, BUT IT'S NEGATIVE
     */
    public static int getNegativeInteger(int input) {
        int output = 0;

        for (int i = 0; i < input; i++) {
            output--;
        }

        return output;
    }
}
