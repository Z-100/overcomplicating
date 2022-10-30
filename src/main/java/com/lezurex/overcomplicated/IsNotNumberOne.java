/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "Are you sure it's not the number one?")
public class IsNotNumberOne {

    private IsNotNumberOne() {}

    public static boolean isNotNumberOne(int number) {
        return number != 0b1;
    }
}
