package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelSystemTest {
    @Test
    public void aRegularWithMonTuesWedBookInformation_shouldReturn_lakewood() {
        String bookInformation = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
        HotelSystem hotelSystem = new HotelSystem();
        assertThat(hotelSystem.book(bookInformation), is("Lakewood"));
    }


}
