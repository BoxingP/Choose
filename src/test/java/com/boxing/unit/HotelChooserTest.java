package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelChooserTest {
    @Test
    public void aRegular1Weekday_shouldReturn_lakewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular",1,0), is("Lakewood"));
    }

    @Test
    public void aRewards1Weekday_shouldReturn_lakewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Rewards",1,0), is("Lakewood"));
    }

    @Test
    public void aRegular1Weekend_shouldReturn_bridgewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular",0,1), is("Bridgewood"));
    }

    @Test
    public void aRewards1Weekend_shouldReturn_ridgewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Rewards",0,1), is("Ridgewood"));
    }
}
