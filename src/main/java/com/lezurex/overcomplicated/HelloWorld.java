/**
 * @author Z-100
 */
package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Math is very useful")
public class HelloWorld {

    private HelloWorld() {}

    /**
     * Are you tired of writing Hello World!'s?
     * Then this method is the right thing for you!
     */
    public static void helloWorld() {

        byte[] helloWorldArray = new byte[12];

        helloWorldArray[0b0] = addLetterH();
        helloWorldArray[0b1] = addLetterE();
        helloWorldArray[0b10] = addLetterL();
        helloWorldArray[0b11] = addLetterL();
        helloWorldArray[0b100] = addLetterO();
        helloWorldArray[0b101] = SPACE();
        helloWorldArray[0b110] = addLetterW();
        helloWorldArray[0b111] = addLetterO();
        helloWorldArray[0b1000] = addLetterR();
        helloWorldArray[0b1001] = addLetterL();
        helloWorldArray[0b1010] = addLetterD();
        helloWorldArray[0b1011] = EGSKLEMATION_MARK();

        String helloWorldString = new String(helloWorldArray);

        System.out.println(helloWorldString);
    }

    private static byte addLetterH() {
        return 0b1001000;
    }

    private static byte addLetterE() {
        return 0b1100101;
    }

    private static byte addLetterL() {
        return 0b1101100;
    }

    private static byte addLetterO() {
        return 0b1101111;
    }

    private static byte SPACE() {
        return 0b100000;
    }

    private static byte addLetterW() {
        return 0b1010111;
    }

    private static byte addLetterR() {
        return 0b1110010;
    }

    private static byte addLetterD() {
        return 0b1100100;
    }

    private static byte EGSKLEMATION_MARK() {
        return 0b100001;
    }
}
