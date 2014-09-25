package com.boxing.hotelSystem;

import com.boxing.unit.*;

import java.util.Arrays;
import java.util.List;

public class HotelSystem {
    public static void main(String[] args) {
        String bookInformation = args[0];
        HotelBooking booking = new HotelBooking(bookInformation);
        HotelChooser chooser = new HotelChooser();
        Hotel lakewood = new Hotel("Lakewood", new Price(110, 90, 80, 80));
        Hotel bridgewood = new Hotel("Bridgewood", new Price(160, 60, 110, 50));
        Hotel ridgewood = new Hotel("Ridgewood", new Price(220, 150, 100, 40));
        List<Hotel> hotelListing= Arrays.asList(lakewood, bridgewood, ridgewood);
        System.out.println(chooser.choose(hotelListing, booking));
    }
}
