package com.boxing.hotelSystem;

import com.boxing.unit.HotelBooking;
import com.boxing.unit.HotelChooser;

public class HotelSystem {
    public String process(String bookInformation) {
        HotelBooking booking = new HotelBooking(bookInformation);
        String clientClass = booking.getClientClass();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        HotelChooser chooser = new HotelChooser();
        return chooser.choose(clientClass, weekdayAmount,weekendAmount);
    }
}
