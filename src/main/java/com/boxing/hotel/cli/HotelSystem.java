package com.boxing.hotel.cli;

import com.boxing.hotel.unit.*;

import java.text.ParseException;

public class HotelSystem {

    private Hotel bookHotel(String bookInformation) throws ParseException {
        HotelChooser chooser = new HotelChooser();
        return chooser.choose(HotelList.HotelListing, bookInformation);
    }

    public static void main(String[] args) throws ParseException {
        String bookInformation = args[0];
        HotelSystem hotelSystem = new HotelSystem();
        Hotel expectedHotel = hotelSystem.bookHotel(bookInformation);

        System.out.println(expectedHotel.getHotelName());
    }
}
