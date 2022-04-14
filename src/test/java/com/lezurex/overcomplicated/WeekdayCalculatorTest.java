package com.lezurex.overcomplicated;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class WeekdayCalculatorTest {

    private static int weekday;

    @BeforeAll
    public static void before() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        weekday = calendar.get(Calendar.DAY_OF_WEEK);
    }

    @Test
    public void testIsMonday() {
        if(weekday == Calendar.MONDAY)
            assertTrue(WeekdayCalculator.isMonday());
        else
            assertFalse(WeekdayCalculator.isMonday());
    }

    @Test
    public void testIsTuesday() {
        if(weekday == Calendar.TUESDAY)
            assertTrue(WeekdayCalculator.isTuesday());
        else
            assertFalse(WeekdayCalculator.isTuesday());
    }

    @Test
    public void testIsWednesday() {
        if(weekday == Calendar.WEDNESDAY)
            assertTrue(WeekdayCalculator.isWednesday());
        else
            assertFalse(WeekdayCalculator.isWednesday());
    }

    @Test
    public void testIsThursday() {
        if(weekday == Calendar.THURSDAY)
            assertTrue(WeekdayCalculator.isThursday());
        else
            assertFalse(WeekdayCalculator.isThursday());
    }

    @Test
    public void testIsFriday() {
        if(weekday == Calendar.FRIDAY)
            assertTrue(WeekdayCalculator.isFriday());
        else
            assertFalse(WeekdayCalculator.isFriday());
    }

    @Test
    public void testIsSaturday() {
        if(weekday == Calendar.SATURDAY)
            assertTrue(WeekdayCalculator.isSaturday());
        else
            assertFalse(WeekdayCalculator.isSaturday());
    }

    @Test
    public void testIsSunday() {
        if(weekday == Calendar.SUNDAY)
            assertTrue(WeekdayCalculator.isSunday());
        else
            assertFalse(WeekdayCalculator.isSunday());
    }

    @Test
    public void testFun() {
        assertThrows(StackOverflowError.class, WeekdayCalculator::fun);
    }

}
