package com.boxing.hotel.unit;

import java.util.Arrays;
import java.util.List;

public class HotelList {
    private static Hotel lakewood = new Hotel("Lakewood", new Price(110, 90, 80, 80), HotelRating.STARS_3);
    private static Hotel bridgewood = new Hotel("Bridgewood", new Price(160, 60, 110, 50), HotelRating.STARS_4);
    private static Hotel ridgewood = new Hotel("Ridgewood", new Price(220, 150, 100, 40), HotelRating.STARS_5);
    public final static List<Hotel> HotelListing = Arrays.asList(lakewood, bridgewood, ridgewood);
}
