/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Calculating the negative integer is very difficult for some people")
public class NegativeInteger {

    private NegativeInteger() {}

    /**
     * Method used to invert an integer. But bad
     *
     * @param input The input integer
     * @return The output integer, BUT IT'S NEGATIVE
     */
    public static int getNegativeInteger(int input) {
        int output = 0b0;

        for (int i = 0b0; i < input; i++) {
            output--;
        }

        return output;
    }
}
