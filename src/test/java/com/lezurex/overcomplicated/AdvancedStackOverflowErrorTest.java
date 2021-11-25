package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdvancedStackOverflowErrorTest {
    
    @Test
    public void testMessage() {
        try {
            throw new AdvancedStackOverflowError();
        } catch(AdvancedStackOverflowError e) {
            assertEquals("Upgrade your PC if u get this Error", e.getMessage(), "Exception message does not match expected message");
        }
    }

}
