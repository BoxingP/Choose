package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelTest {
    Hotel hotel;

    @Before
    public void initObject() {
        hotel = new Hotel("Lakewood",110,90,80,80);
    }

    @Test
    public void nameIsLakewood_shouldReturn_lakewood() {
        assertThat(hotel.getHotelName(), is("Lakewood"));
    }

    @Test
    public void regularWeekdayUnitPriceIs110_shouldReturn_110() {
        assertThat(hotel.getRegularWeekdayUnitPrice(), is(110));
    }

    @Test
    public void regularWeekendUnitPriceIs90_shouldReturn_90() {
        assertThat(hotel.getRegularWeekendUnitPrice(), is(90));
    }

    @Test
    public void rewardsWeekdayUnitPriceIs80_shouldReturn_80() {
        assertThat(hotel.getRewardsWeekdayUnitPrice(), is(80));
    }

    @Test
    public void rewardsWeekendUnitPriceIs80_shouldReturn_80() {
        assertThat(hotel.getRewardsWeekendUnitPrice(), is(80));
    }
}