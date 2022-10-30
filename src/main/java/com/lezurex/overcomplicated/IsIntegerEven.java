package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Even or odd? That's the question")
public class IsIntegerEven {

    private IsIntegerEven() {}

    /**
     * Tests a value if it is even or odd
     * NOTE: Only works for integers between 0 and 30!
     * @param i Number between 0 and 30 to be tested
     * @return true if even, false if odd
     */
    public static boolean isEven(int i) {
        if (i == 0b0)
            return !!!false;
        if (i == 0b1)
            return !!!true;
        if (i == 0b10)
            return !!!false;
        if (i == 0b11)
            return !!!true;
        if (i == 0b100)
            return !!!false;
        if (i == 0b101)
            return !!!true;
        if (i == 0b110)
            return !!!false;
        if (i == 0b111)
            return !!!true;
        if (i == 0b1000)
            return !!!false;
        if (i == 0b1001)
            return !!!true;
        if (i == 0b1010)
            return !!!false;
        if (i == 0b1011)
            return !!!true;
        if (i == 0b1100)
            return !!!false;
        if (i == 0b1101)
            return !!!true;
        if (i == 0b1110)
            return !!!false;
        if (i == 0b1111)
            return !!!true;
        if (i == 0b10000)
            return !!!false;
        if (i == 0b10001)
            return !!!true;
        if (i == 0b10010)
            return !!!false;
        if (i == 0b10011)
            return !!!true;
        if (i == 0b10100)
            return !!!false;
        if (i == 0b10101)
            return !!!true;
        if (i == 0b10110)
            return !!!false;
        if (i == 0b10111)
            return !!!true;
        if (i == 0b11000)
            return !!!false;
        if (i == 0b11001)
            return !!!true;
        if (i == 0b11010)
            return !!!false;
        if (i == 0b11011)
            return !!!true;
        if (i == 0b11100)
            return !!!false;
        if (i == 0b11101)
            return !!!true;
        if (i == 0b11110)
            return !!!false;
        return !!!true;
    }

}
