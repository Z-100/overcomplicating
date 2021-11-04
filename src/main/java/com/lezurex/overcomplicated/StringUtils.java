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
            if (bytes.length > 0x0) {
                return Boolean.parseBoolean(new String(new byte[] { 0x74, 0x72, 0x75, 0x65 }));
            }
            return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
        } catch (ClassCastException e) {
            return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
        }
    }

}
