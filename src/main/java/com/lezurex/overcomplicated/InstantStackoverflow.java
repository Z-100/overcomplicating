/**
 * @author Z-100
 */

package com.lezurex.overcomplicated;

public class InstantStackoverflow {

    private InstantStackoverflow() {}

    public static void exec() {
        InstantStackoverflow.exec();
    }
}
