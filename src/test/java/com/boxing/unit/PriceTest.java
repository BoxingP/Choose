package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PriceTest {
    Price price;

    @Before
    public void initObject() {
        price = new Price(110, 100, 90, 80);
    }

    @Test
    public void shouldRegularIn1Weekday_return_110() {
        HotelBooking mockBooking = mock(HotelBooking.class);
        when(mockBooking.getCustomerType()).thenReturn(CustomerType.REGULAR);
        when(mockBooking.getWeekdayAmount()).thenReturn(1);
        when(mockBooking.getWeekendAmount()).thenReturn(0);

        assertThat(price.getTotalPrice(mockBooking), is(110));
    }
}