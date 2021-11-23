/**
 * @author Lezurex
 */
package com.lezurex.overcomplicated;

public class StringUtils {

    private StringUtils() {}

    /**
     * Checks if the provided object is a String
     * 
     * @param possiblySomeStringOrNotQuestionMark
     * @return
     */
    public static boolean isString(Object possiblySomeStringOrNotQuestionMark) {
        try {
            byte[] bytes = (byte[]) ((String) possiblySomeStringOrNotQuestionMark).getBytes();
            if (bytes.length > 0b0) {
                return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
            }
            return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
        } catch (ClassCastException e) {
            return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
        }
    }

}
