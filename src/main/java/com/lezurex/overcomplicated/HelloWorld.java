package com.lezurex.overcomplicated;

public class HelloWorld {

    public static void helloWorld() {

        byte[] helloWorldArray = new byte[12];

        helloWorldArray[0] = addLetterH();
        helloWorldArray[1] = addLetterE();
        helloWorldArray[2] = addLetterL();
        helloWorldArray[3] = addLetterL();
        helloWorldArray[4] = addLetterO();
        helloWorldArray[5] = SPACE();
        helloWorldArray[6] = addLetterW();
        helloWorldArray[7] = addLetterO();
        helloWorldArray[8] = addLetterR();
        helloWorldArray[9] = addLetterL();
        helloWorldArray[10] = addLetterD();
        helloWorldArray[11] = EGSKLEMATION_MARK();

        String helloWorldString = new String(helloWorldArray);

        System.out.println(helloWorldString);
    }

    private static byte addLetterH() {
        return 0x48;
    }

    private static byte addLetterE() {
        return 0x65;
    }

    private static byte addLetterL() {
        return 0x6c;
    }

    private static byte addLetterO() {
        return 0x6f;
    }

    private static byte SPACE() {
        return 0x20;
    }

    private static byte addLetterW() {
        return 0x57;
    }

    private static byte addLetterR() {
        return 0x72;
    }

    private static byte addLetterD() {
        return 0x64;
    }

    private static byte EGSKLEMATION_MARK() {
        return 0x21;
    }
}
