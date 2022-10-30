/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

@VeryUseful(theBecause = "You can blame the author of this class for all StackOverflows")
public class InstantStackoverflow {

    private InstantStackoverflow() {}

    public static void exec() {
        InstantStackoverflow.exec();
    }
}
