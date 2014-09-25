package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelBookingTest {
    @Test
    public void dateIsMonWeekdayAmount_shouldReturn_One() {
        HotelBooking hotelBooking = new HotelBooking("Regular: 22Sep2014(mon)");
        assertThat(hotelBooking.getWeekdayAmount(), is(1));
    }

    @Test
    public void dateIsSatWeekendAmount_shouldReturn_One() {
        HotelBooking hotelBooking = new HotelBooking("Regular: 27Sep2014(sat)");
        assertThat(hotelBooking.getWeekendAmount(), is(1));
    }

    @Test
    public void aBookInformationWithRegular_shouldReturn_Regular() {
        HotelBooking hotelBooking = new HotelBooking("Regular: 22Sep2014(mon)");
        assertThat(hotelBooking.getCustomerType(), is(CustomerType.REGULAR));
    }
}
