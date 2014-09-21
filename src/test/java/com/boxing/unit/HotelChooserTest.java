package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelChooserTest {
    @Test
    public void aRegularWithMon_shouldReturn_lakewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular",1,0), is("Lakewood"));
    }

    @Test
    public void aRewardsWithMon_shouldReturn_lakewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular",1,0), is("Lakewood"));
    }

    @Test
    public void aRegularWithSat_shouldReturn_bridgewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular",0,1), is("Bridgewood"));
    }
}
