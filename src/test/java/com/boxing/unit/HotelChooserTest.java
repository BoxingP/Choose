package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelChooserTest {
    @Test
    public void aRegularWithMon_shouldReturn_lakewood() {
        HotelChooser hotelChooser = new HotelChooser();
        assertThat(hotelChooser.choose("Regular: 16Mar2009(mon)"), is("Lakewood"));
    }
}
