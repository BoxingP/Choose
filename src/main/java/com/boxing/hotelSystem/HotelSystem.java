package com.boxing.hotelSystem;

import com.boxing.unit.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class HotelSystem {
    public static void main(String[] args) throws ParseException{
        String bookInformation = args[0];
        HotelBooking booking = new HotelBooking(bookInformation);
        HotelChooser chooser = new HotelChooser();
        Hotel lakewood = new Hotel("Lakewood", new Price(110, 90, 80, 80), HotelRating.STARS_3);
        Hotel bridgewood = new Hotel("Bridgewood", new Price(160, 60, 110, 50), HotelRating.STARS_4);
        Hotel ridgewood = new Hotel("Ridgewood", new Price(220, 150, 100, 40), HotelRating.STARS_5);
        List<Hotel> hotelListing= Arrays.asList(lakewood, bridgewood, ridgewood);
        Hotel chosenHotel=chooser.choose(hotelListing, booking);
        System.out.println(chosenHotel.getHotelName());
    }
}
