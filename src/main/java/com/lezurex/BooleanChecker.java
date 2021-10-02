package com.lezurex;

public class BooleanChecker {

    public static void main(String[] args) {
        System.out.println(isTrue(true));
    }

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

}