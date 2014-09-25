package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelTest {

    @Test
    public void bookingIsRegularWith1Weekday_shouldReturn_110() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 1;
            }

            public int getWeekendAmount() {
                return 0;
            }

            public String getClientLevel() {
                return "Regular";
            }
        };
        assertThat(new Hotel(booking, new Price(110, 90, 80, 80)).getPrice(), is(110));
    }
}