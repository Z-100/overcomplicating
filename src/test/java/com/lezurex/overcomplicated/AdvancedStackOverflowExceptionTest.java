package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdvancedStackOverflowExceptionTest {
    
    @Test
    public void testMessage() {
        try {

        } catch(AdvancedStackOverflowException e) {
            assertEquals("Upgrade your PC if u get this Error", e.getMessage(), "Exception message does not match expected message");
        }
    }

}
