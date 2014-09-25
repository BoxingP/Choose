package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HotelChooserTest {
    HotelChooser chooser;
    List<Hotel> hotelListing;
    Hotel mockLakewood;
    Hotel mockBridgewood;
    Hotel mockRidgewood;

    @Before
    public void initObject() {
        chooser = new HotelChooser();
        mockLakewood=mock(Hotel.class);
        mockBridgewood=mock(Hotel.class);
        mockRidgewood=mock(Hotel.class);
        hotelListing = Arrays.asList(mockLakewood,mockBridgewood,mockRidgewood);
    }

    @Test
    public void ShouldLakewoodIsCheap_return_lakewood() {
        when(mockLakewood.getPrice()).thenReturn(1);
        when(mockBridgewood.getPrice()).thenReturn(2);
        when(mockRidgewood.getPrice()).thenReturn(2);
        assertThat(chooser.choose(hotelListing), is("Lakewood"));
    }

    @Test
    public void ShouldRidgewoodRatingIsHigh_return_ridgewood() {
        when(mockLakewood.getPrice()).thenReturn(3);
        when(mockBridgewood.getPrice()).thenReturn(2);
        when(mockRidgewood.getPrice()).thenReturn(2);
        assertThat(chooser.choose(hotelListing), is("Ridgewood"));
    }
}
