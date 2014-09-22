package com.boxing.hotelSystem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelSystemTest {
    @Test
    public void aRegularWithMonTuesWedBookInformation_shouldReturn_lakewood() {
        String bookInformation = "Regular: 22Sep2014(mon), 23Sep2014(tues), 24Sep2014(wed)";
        HotelSystem hotelSystem = new HotelSystem();
        assertThat(hotelSystem.process(bookInformation), is("Lakewood"));
    }

    @Test
    public void aRegularWithFriSatSunBookInformation_shouldReturn_bridgewood() {
        String bookInformation = "Regular: 26Sep2014(fri), 27Sep2014(sat), 28Sep2014(sun)";
        HotelSystem hotelSystem = new HotelSystem();
        assertThat(hotelSystem.process(bookInformation), is("Bridgewood"));
    }

    @Test
    public void aRewardsWithThurFriSatBookInformation_shouldReturn_ridgewood() {
        String bookInformation = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        HotelSystem hotelSystem = new HotelSystem();
        assertThat(hotelSystem.process(bookInformation), is("Ridgewood"));
    }
}
