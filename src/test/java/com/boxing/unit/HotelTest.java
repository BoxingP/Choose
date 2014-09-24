package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelTest {

    @Test
    public void nameIsAbc_shouldReturn_lakewood() {
        assertThat(new Hotel("Abc").getHotelName(), is("Abc"));
    }

    @Test
    public void bookingIsRegularWith1Weekday_shouldReturn_110() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 1;
            }

            public int getWeekendAmount() {
                return 0;
            }

            public String getClientClass() {
                return "Regular";
            }
        };
        assertThat(new Hotel("Lakewood",110,90,80,80,booking).getPrice(), is(110));
    }
}