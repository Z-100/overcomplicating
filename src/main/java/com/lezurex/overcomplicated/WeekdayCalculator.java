package com.lezurex.overcomplicated;

import java.util.Calendar;
import java.util.Date;

/**
 * @author VoxCrafterLP
 * Class used for getting the current weekday
 */
public class WeekdayCalculator {

    private WeekdayCalculator() {}

    /**
     * Checks if the current day is thursday
     * @return true if it is thursday, false if not
     */
    public static boolean isThursday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY;
    }

    /**
     * Checks if the current day is tuesday
     * @return true if it is tuesday, false if not
     */
    public static boolean isTuesday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(isThursday()) {
            return false;
        }

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY;
    }

    /**
     * Checks if the current day is wednesday
     * @return true if it is wednesday, false if not
     */
    public static boolean isWednesday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(isThursday()) {
            return false;
        }
        if(isTuesday()) {
            return false;
        }

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
    }

    /**
     * Checks if the current day is saturday
     * @return true if it is saturday, false if not
     */
    public static boolean isSaturday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(isThursday()) {
            return false;
        }
        if(isTuesday()) {
            return false;
        }
        if(isWednesday()) {
            return false;
        }

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
    }

    /**
     * Checks if the current day is sunday
     * @return true if it is sunday, false if not
     */
    public static boolean isSunday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(isThursday()) {
            return false;
        }
        if(isTuesday()) {
            return false;
        }
        if(isWednesday()) {
            return false;
        }
        if(isSaturday()) {
            return false;
        }

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

    /**
     * Checks if the current day is friday
     * @return true if it is friday, false if not
     */
    public static boolean isFriday() {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(isThursday()) {
            return false;
        }
        if(isTuesday()) {
            return false;
        }
        if(isWednesday()) {
            return false;
        }
        if(isSaturday()) {
            return false;
        }
        if(isSunday()) {
            return false;
        }

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }

    /**
     * Checks if the current day is monday
     * @return true if it is monday, false if not
     */
    public static boolean isMonday() {
        if(!isThursday()) {
            if(!isTuesday()) {
                if(!isWednesday()) {
                    if(!isSaturday()) {
                        if(!isSunday()) {
                            if(!isFriday()) {
                                return false;
                            } else
                                return false;
                        } else
                            return false;
                    } else
                        return false;
                } else
                    return false;
            } else
                return false;
        } else
            return false;
    }

    /**
     * Throw a StackOverflow
     */
    public static void fun() {
        InstantStackoverflow.exec();
    }

}
