package com.lezurex.overcomplicated;

import static com.lezurex.overcomplicated.OneToTen.countFromOneToTen;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OneToTenTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void oneToTen() {
        countFromOneToTen(); // cheap fix
        assertTrue("1\n2\n3\n4\n5\n6\n7\n8\n9\n10".equals(outputStreamCaptor.toString().trim())
                || "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10".equals(outputStreamCaptor.toString().trim()));
    }

}
