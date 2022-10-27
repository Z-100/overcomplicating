package com.lezurex.overcomplicated;

import java.util.*;

/**
 * @author Lezurex, Z-100
 * @since 1.0
 * @version 1.0
 */
public final class StringUtils {

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

    /**
     * Checks if the provided object is not a String
     *
     * @param possiblySomeStringOrNotQuestionMark possible not String
     * @return true if the provided object is not a String
     */
    public static boolean isNotString(Object possiblySomeStringOrNotQuestionMark) {
        try {
            byte[] bytes = (byte[]) ((String) possiblySomeStringOrNotQuestionMark).getBytes();
            if (bytes.length > 0b0) {
                return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
            }
            return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
        } catch (ClassCastException e) {
            return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
        }
    }

    /**
     * Method used to determine if the entered String exactly is 21 characters long
     *
     * @param possibleStringWhoseLengthMightBeTwentyOneCharactersLong The possible String whose length might be twenty-one characters long
     * @param <PossibleStringWhoseLengthMightBeTwentyOneCharactersLong> The possible String whose length might be twenty-one characters long
     * @return A new highly advanced type of boolean to determine the result of this method
     */
    public static <PossibleStringWhoseLengthMightBeTwentyOneCharactersLong> boolean isExactlyTwentyOneCharactersLong(PossibleStringWhoseLengthMightBeTwentyOneCharactersLong possibleStringWhoseLengthMightBeTwentyOneCharactersLong) {

        if (possibleStringWhoseLengthMightBeTwentyOneCharactersLong instanceof final String definitelyAStringButWeDontKnowIfItsTwentyOneCharactersLong) {

            final byte[] theBytesOfThisStringByteArrayMightBeTwentyOneCharactersLong = definitelyAStringButWeDontKnowIfItsTwentyOneCharactersLong.getBytes();

            int characterCounterOfThePassedObjectWhichByNowDefinitelyIsAString = 0b0;

            List<Byte> theBytesOfThisStringByteArrayMightBeTwentyOneCharactersLongAsList = new ArrayList<>();

            for (byte b : theBytesOfThisStringByteArrayMightBeTwentyOneCharactersLong) {
                theBytesOfThisStringByteArrayMightBeTwentyOneCharactersLongAsList.add(b);
            }

            Iterator<Byte> iterator = theBytesOfThisStringByteArrayMightBeTwentyOneCharactersLongAsList.iterator();

            while (iterator.hasNext()) {
                Byte next = iterator.next();
                if (next != null) {
                    String someCharOfTheEnteredByteArrayAsAString = next.toString();
                    if (someCharOfTheEnteredByteArrayAsAString != null) {
                        boolean doesTrueActuallyMeanTrueQuestionMark = Boolean.valueOf("true").equals(true);
                        if (doesTrueActuallyMeanTrueQuestionMark) {
                            boolean doesFalseActuallyMeanFalseQuestionMark = Boolean.valueOf("false").equals(false);
                            if (doesFalseActuallyMeanFalseQuestionMark) {
                                characterCounterOfThePassedObjectWhichByNowDefinitelyIsAString++;
                            }
                        }
                    }
                }
            }
            return characterCounterOfThePassedObjectWhichByNowDefinitelyIsAString == 0b10101 ? Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 })) : Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
        } else {
            return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
        }
    }

    /**
     * Method used to determine if the entered String exactly is NOT 21 characters long
     * @param possibleStringWhoseLengthMightBeTwentyOneCharactersLong The possible String whose length might not be twenty-one characters long
     * @param <PossibleStringWhoseLengthMightNotBeTwentyOneCharactersLong> The possible String whose length might not be twenty-one characters long
     * @return A new highly advanced type of boolean to determine the result of this method
     */
    public static <PossibleStringWhoseLengthMightNotBeTwentyOneCharactersLong> boolean isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(PossibleStringWhoseLengthMightNotBeTwentyOneCharactersLong possibleStringWhoseLengthMightBeTwentyOneCharactersLong) {

        if (possibleStringWhoseLengthMightBeTwentyOneCharactersLong instanceof final String definitelyAStringButWeDontKnowIfItsTwentyOneCharactersLong) {

            return switch (definitelyAStringButWeDontKnowIfItsTwentyOneCharactersLong.length()) {
                case 0b00000 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00001 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00010 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00011 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00100 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00101 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00110 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b00111 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01000 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01001 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01010 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01011 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01100 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01101 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01110 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b01111 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10000 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10001 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10010 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10011 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10100 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10101 -> Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
                case 0b10110 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b10111 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11000 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11001 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11010 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11011 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11100 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11101 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                case 0b11110 -> Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                default -> throw new IllegalStateException(new String(new byte[] {0b01010110, 0b01100001, 0b01101100, 0b01110101, 0b01100101, 0b00100000, 0b01110100, 0b01101111, 0b01101111, 0b00100000, 0b01101100, 0b01101111, 0b01101110, 0b01100111}));
            };
        } else {
            return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
        }
    }

    /**
     * Used to determine if the given String is, in fact, a Hello World!
     *
     * @param possibleHelloWorldString The String to check
     * @param <PossibleHelloWorldString> The type of the String to check
     * @return Whether the given String is a Hello World!
     */
    public static <PossibleHelloWorldString> boolean isAHelloWorldString(PossibleHelloWorldString possibleHelloWorldString) {

        if (possibleHelloWorldString instanceof final String definitelyAStringButWeDontKnowIfItsAHelloWorld) {
            if (new Integer(0b1100).equals(definitelyAStringButWeDontKnowIfItsAHelloWorld.length())) {
                if (0b01001000 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(0)) {
                    if (0b01100101 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(1)) {
                        if (0b01101100 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(2)) {
                            if (0b01101100 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(3)) {
                                if (0b01101111 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(4)) {
                                    if (0b00100000 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(5)) {
                                        if (0b01010111 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(6)) {
                                            if (0b01101111 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(7)) {
                                                if (0b01110010 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(8)) {
                                                    if (0b01101100 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(9)) {
                                                        if (0b01100100 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(10)) {
                                                            if (0b00100001 == definitelyAStringButWeDontKnowIfItsAHelloWorld.charAt(11)) {
                                                                return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
    }

    /**
     * Does not parse the given Object to a String
     *
     * @param objectNotToParse The Object to not parse
     * @param <ObjectNotToParse> The type of the Object to not parse
     */
    public static <ObjectNotToParse> void dontParse(ObjectNotToParse objectNotToParse) {}

    /**
     * Used to generate random string
     * @return random string
     */
    public static String getRandomString() {
        return new String(new byte[] { 0b01110010, 0b01100001, 0b01101110, 0b01100100, 0b01101111, 0b01101101, 0b00100000, 0b01110011, 0b01110100, 0b01110010, 0b01101001, 0b01101110, 0b01100111 });
    }
}
