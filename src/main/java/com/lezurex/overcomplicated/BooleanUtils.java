/**
* @author Lezurex
*/

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

/**
 * Some methods for doing easy tasks in a more stylish way
 */
@VeryUseful(theBecause = "Math is very useful")
public class BooleanUtils {

    private BooleanUtils() {
    }

    /**
     * Checks if the provided boolean is true
     * 
     * @param input boolean value to be checked
     * @return whether or not the provided value is true
     */
    public static boolean isTrue(boolean input) {
        String stringifiedBoolean = Boolean.toString(input);
        if (stringifiedBoolean.charAt(0b0) == 0b1110100) {
            if (stringifiedBoolean.charAt(0b1) == 0b1110010) {
                if (stringifiedBoolean.charAt(0b10) == 0b1110101) {
                    if (stringifiedBoolean.charAt(0b11) == 0b1100101) {
                        return Boolean
                                .parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                    }
                }
            }
        }
        return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
    }

    /**
     * Checks if the provided boolean is false
     * 
     * @param input boolean value to be checked
     * @return whether or not the provided value is false
     */
    public static boolean isFalse(boolean input) {
        String stringifiedBoolean = Boolean.toString(input);
        if (stringifiedBoolean.charAt(0b0) == 0b1100110) {
            if (stringifiedBoolean.charAt(0b1) == 0b1100001) {
                if (stringifiedBoolean.charAt(0b10) == 0b1101100) {
                    if (stringifiedBoolean.charAt(0b11) == 0b1110011) {
                        if (stringifiedBoolean.charAt(0b100) == 0b1100101) {
                            return Boolean.parseBoolean(
                                    new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                        }
                    }
                }
            }
        }
        return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
    }

    /**
     * Inverts a boolean value
     * 
     * @param input boolean to be inverted
     * @return inverted boolean
     */
    public static boolean invert(boolean input) {
        return !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!input;
    }

}
