package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelBookingTest {
    @Test
    public void dateIsMonWeekdayAmount_shouldReturn_One() {
        HotelBooking hotelBooking = new HotelBooking();
        assertThat(hotelBooking.getWeekdayAmount("22Sep2014(mon)"), is(1));
    }

    @Test
    public void dateIsSatWeekendAmount_shouldReturn_One() {
        HotelBooking hotelBooking = new HotelBooking();
        assertThat(hotelBooking.getWeekendAmount("27Sep2014(sat)"), is(1));
    }

    @Test
    public void aBookInformationWithRegular_shouldReturn_Regular() {
        HotelBooking hotelBooking = new HotelBooking();
        assertThat(hotelBooking.getClientClass("Regular: 22Sep2014(mon)"),is("Regular"));
    }

    @Test
    public void aBookInformationWithDates_shouldReturn_DateArray() {
        HotelBooking hotelBooking = new HotelBooking();
        assertThat(hotelBooking.getDate("Regular: 22Sep2014(mon),23Sep2014(tues)"), is(new String[] {"22Sep2014(mon)","23Sep2014(tues)"}));
    }
}
