package com.boxing.hotelSystem;

import com.boxing.unit.HotelBooking;
import com.boxing.unit.HotelChooser;
import com.boxing.unit.PrintOutput;

public class HotelSystem {
    public static void main(String[] args) {
        String bookInformation = args[0];
        HotelBooking booking = new HotelBooking(bookInformation);
        String clientClass = booking.getClientClass();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        HotelChooser chooser = new HotelChooser();
        String result = chooser.choose(clientClass, weekdayAmount,weekendAmount);
        new PrintOutput().print(result);
    }
}
