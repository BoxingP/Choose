package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelBookingTest {
    @Test
    public void whenDateIsMonWeekdayAmount_shouldReturn_One() {
        HotelBooking hotelBooking = new HotelBooking();
        assertThat(hotelBooking.getWeekdayAmount("22Sep2014(mon)"), is(1));
    }
}
