package com.lezurex.overcomplicated;

import static com.lezurex.overcomplicated.OneToTen.countFromOneToTen;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OneToTenTest {

    /**
     * Always succeeds. Just for demonstration purposes.
     */
    @Test
    public void oneToTen() {
        countFromOneToTen();
        assertTrue(true);
    }
    
}
