/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Math is very useful")
public class ConvertToInt {

    private ConvertToInt() {}

    /**
     * Method used to convert an int to an int
     *
     * @param input The input int
     * @return The output int
     */
    public static int toInt(int input) {
        return input;
    }
}
