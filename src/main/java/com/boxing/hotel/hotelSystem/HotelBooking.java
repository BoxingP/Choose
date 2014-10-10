package com.boxing.hotel.hotelSystem;

import com.boxing.hotel.unit.BookingParsing;
import com.boxing.hotel.unit.CustomerType;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

public class HotelBooking {
    private CustomerType customerType;
    private List<Calendar> dates;

    public HotelBooking(String bookInformation) throws ParseException {
        BookingParsing bookingParsing = new BookingParsing();
        customerType = bookingParsing.getCustomerType(bookInformation);
        dates = bookingParsing.getDates(bookInformation);
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public int getWeekdayAmount() {
        return dates.size() - getWeekendAmount();
    }

    public int getWeekendAmount() {

        int weekendAmount = 0;
        for (Calendar date : dates) {
            if (isWeekend(date)) weekendAmount++;
        }
        return weekendAmount;
    }

    private boolean isWeekend(Calendar date) {
        int i = date.get(Calendar.DAY_OF_WEEK);
        return (i == Calendar.SATURDAY || i == Calendar.SUNDAY);
    }
}
