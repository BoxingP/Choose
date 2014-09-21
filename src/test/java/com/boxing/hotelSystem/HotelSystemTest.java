package com.boxing.hotelSystem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelSystemTest {
    @Test
    public void aRegularWithMonTuesWedBookInformation_shouldReturn_lakewood() {
        String bookInformation = "Regular: 22Sep2014(mon), 23Sep2014(tues), 24Sep2014(wed)";
        HotelSystem hotelSystem = new HotelSystem();
        assertThat(hotelSystem.book(bookInformation), is("Lakewood"));
    }


}
