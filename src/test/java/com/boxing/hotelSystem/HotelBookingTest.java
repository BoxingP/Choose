package com.boxing.hotelSystem;

import com.boxing.unit.CustomerType;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.text.ParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelBookingTest {
    @Test
    public void shouldDateIsMonWeekdayAmount_return_1() throws ParseException{
        HotelBooking hotelBooking = new HotelBooking("Regular: 22Sep2014(mon)");
        assertThat(hotelBooking.getWeekdayAmount(), is(1));
    }

    @Test
    public void shouldDateIsSatWeekendAmount_return_1() throws ParseException{
        HotelBooking hotelBooking = new HotelBooking("Regular: 27Sep2014(sat)");
        assertThat(hotelBooking.getWeekendAmount(), is(1));
    }

    @Test
    public void aBookInformationWithRegular_shouldReturn_Regular() throws ParseException{
        HotelBooking hotelBooking = new HotelBooking("Regular: 22Sep2014(mon)");
        assertThat(hotelBooking.getCustomerType(), Is.is(CustomerType.REGULAR));
    }
}
