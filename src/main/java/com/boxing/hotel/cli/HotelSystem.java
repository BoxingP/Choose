package com.boxing.hotel.cli;

import com.boxing.hotel.unit.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

public class HotelSystem {

    private Hotel bookHotel(String bookInformationStr) throws ParseException {
        HotelChooser chooser = new HotelChooser();
        BookingParsing bookingParsing = new BookingParsing();
        CustomerType customerType = bookingParsing.getCustomerType(bookInformationStr);
        List<Calendar> dates = bookingParsing.getDates(bookInformationStr);
        BookInformation bookInformation = new BookInformation(customerType, dates);

        return chooser.choose(HotelList.HotelListing, bookInformation);
    }

    public static void main(String[] args) throws ParseException {
        String bookInformation = args[0];
        HotelSystem hotelSystem = new HotelSystem();
        Hotel expectedHotel = hotelSystem.bookHotel(bookInformation);

        System.out.println(expectedHotel.getHotelName());
    }
}
