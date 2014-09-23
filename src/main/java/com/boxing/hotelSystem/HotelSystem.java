package com.boxing.hotelSystem;

import com.boxing.unit.HotelBooking;
import com.boxing.unit.HotelChooser;

public class HotelSystem {
    public static void main(String[] args) {
        String bookInformation = args[0];
        HotelBooking booking = new HotelBooking(bookInformation);
        HotelChooser chooser = new HotelChooser(booking);
        System.out.println(chooser.choose());
    }
}
