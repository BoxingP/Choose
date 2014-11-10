package com.boxing.hotel.unit;

import java.util.Calendar;
import java.util.List;

public class BookInformation {
    private final CustomerType customerType;
    private final List<Calendar> bookingDates;

    public BookInformation(CustomerType customerType, List<Calendar> bookingDates) {
        this.customerType = customerType;
        this.bookingDates = bookingDates;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public List<Calendar> getBookingDates() {
        return bookingDates;
    }
}
