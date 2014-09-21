package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelChooserTest {
    HotelChooser hotelChooser;

    @Before
    public void initObject() {
        hotelChooser = new HotelChooser();
    }

    @Test
    public void aRegular1Weekday_shouldReturn_lakewood() {
        assertThat(hotelChooser.choose("Regular",1,0), is("Lakewood"));
    }

    @Test
    public void aRewards1Weekday_shouldReturn_lakewood() {
        assertThat(hotelChooser.choose("Rewards",1,0), is("Lakewood"));
    }

    @Test
    public void aRegular1Weekend_shouldReturn_bridgewood() {
        assertThat(hotelChooser.choose("Regular",0,1), is("Bridgewood"));
    }

    @Test
    public void aRewards1Weekend_shouldReturn_ridgewood() {
        assertThat(hotelChooser.choose("Rewards",0,1), is("Ridgewood"));
    }

    @Test
    public void aRegular3Weekday5Weekend_shouldReturn_Bridgewood() {
        assertThat(hotelChooser.choose("Regular",3,5), is("Bridgewood"));
    }
}
