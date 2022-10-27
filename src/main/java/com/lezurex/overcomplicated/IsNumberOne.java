/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Are you sure it's actually the number one?")
public class IsNumberOne {

    private IsNumberOne() {}

    public static boolean isNumberOne(int number) {
        return number == 0b1;
    }
}
