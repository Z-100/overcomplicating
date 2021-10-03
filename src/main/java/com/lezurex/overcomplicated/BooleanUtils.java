package com.lezurex.overcomplicated;

/**
 * Some methods for doing easy tasks in a more stylish way
 */
public class BooleanUtils {

    private BooleanUtils() {}

    /**
     * Checks if the provided boolean is true
     * @param input boolean value to be checked
     * @return whether or not the provided value is true
     */
    public static boolean isTrue(boolean input) {
        String stringifiedBoolean = Boolean.toString(input);
        if (stringifiedBoolean.charAt(0x0) == 0x74) {
            if (stringifiedBoolean.charAt(0x1) == 0x72) {
                if (stringifiedBoolean.charAt(0x2) == 0x75) {
                    if (stringifiedBoolean.charAt(0x3) == 0x65) {
                        return Boolean.parseBoolean(new String(new byte[] { 0x74, 0x72, 0x75, 0x65 }));
                    }
                    return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
                }
                return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
            }
            return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
        }
        return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
    }

    /**
     * Checks if the provided boolean is false
     * @param input boolean value to be checked
     * @return whether or not the provided value is false
     */
    public static boolean isFalse(boolean input) {
        String stringifiedBoolean = Boolean.toString(input);
        if (stringifiedBoolean.charAt(0x0) == 0x66) {
            if (stringifiedBoolean.charAt(0x1) == 0x61) {
                if (stringifiedBoolean.charAt(0x2) == 0x6C) {
                    if (stringifiedBoolean.charAt(0x3) == 0x73) {
                        if (stringifiedBoolean.charAt(0x4) == 0x65) {
                            return Boolean.parseBoolean(new String(new byte[] { 0x74, 0x72, 0x75, 0x65 }));
                        }
                        return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
                    }
                    return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
                }
                return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
            }
            return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
        }
        return Boolean.parseBoolean(new String(new byte[] { 0x66, 0x61, 0x6C, 0x73, 0x65 }));
    }

    /**
     * Inverts a boolean value
     * @param input boolean to be inverted
     * @return inverted boolean
     */
    public static boolean invert(boolean input) {
        return !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!input;
    }

}