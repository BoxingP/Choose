package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HotelTest {

    @Test
    public void bookingIsRegularWith1Weekday_shouldReturn_110() {
        HotelBooking mockBooking = mock(HotelBooking.class);
        when(mockBooking.getClientLevel()).thenReturn("Regular");
        when(mockBooking.getWeekdayAmount()).thenReturn(1);
        when(mockBooking.getWeekendAmount()).thenReturn(0);
        assertThat(new Hotel("A", new Price(110, 90, 80, 80)).getPrice(mockBooking), is(110));
    }
}