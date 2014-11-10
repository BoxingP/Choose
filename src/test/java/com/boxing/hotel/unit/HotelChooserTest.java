package com.boxing.hotel.unit;

import com.boxing.hotel.unit.Hotel;
import com.boxing.hotel.unit.HotelChooser;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

public class HotelChooserTest {
    HotelChooser chooser;
    Hotel mockHotelA;
    Hotel mockHotelB;
    List<Hotel> hotelListing;
//    HotelBooking booking;

    @Before
    public void initObject() {
        chooser = new HotelChooser();
        mockHotelA = mock(Hotel.class);
        mockHotelB = mock(Hotel.class);
        hotelListing = Arrays.asList(mockHotelA, mockHotelB);
//        booking = mock(HotelBooking.class);
    }

//    @Test
//    public void ShouldHotelAIsCheap_return_hotelA() {
//        when(mockHotelA.getPrice(booking)).thenReturn(2);
//        when(mockHotelA.getRating()).thenReturn(3);
//        when(mockHotelB.getPrice(booking)).thenReturn(3);
//        when(mockHotelB.getRating()).thenReturn(3);
//        assertThat(chooser.choose(hotelListing, booking), is(mockHotelA));
//    }
//
//    @Test
//    public void ShouldHotelBRatingIsHigh_return_hotelB() {
//        when(mockHotelA.getPrice(booking)).thenReturn(2);
//        when(mockHotelA.getRating()).thenReturn(3);
//        when(mockHotelB.getPrice(booking)).thenReturn(2);
//        when(mockHotelB.getRating()).thenReturn(4);
//        assertThat(chooser.choose(hotelListing, booking), is(mockHotelB));
//    }
//
//    @Test
//    public void ShouldHotelBPriceIsLowRatingIsLow_return_hotelB() {
//        when(mockHotelA.getPrice(booking)).thenReturn(2);
//        when(mockHotelA.getRating()).thenReturn(4);
//        when(mockHotelB.getPrice(booking)).thenReturn(1);
//        when(mockHotelB.getRating()).thenReturn(3);
//        assertThat(chooser.choose(hotelListing, booking), is(mockHotelB));
//    }
}
