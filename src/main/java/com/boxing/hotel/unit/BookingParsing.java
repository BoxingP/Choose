package com.boxing.hotel.unit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BookingParsing {

    public CustomerType getCustomerType(String bookInformation) {
        String[] information = bookInformation.split(": ");
        return CustomerType.valueOf(information[0].toUpperCase());
    }

    public List<Calendar> getDates(String bookInformation) throws ParseException {
        String[] information = bookInformation.split(": ");
        String[] dates = information[1].split(", ");
        List<String> datesWithoutWeek = deleteWeek(dates);
        List<Calendar> bookingDates = new ArrayList<Calendar>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy");
        for (String date : datesWithoutWeek) {
            Date bookingDate = dateFormat.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(bookingDate);
            bookingDates.add(calendar);
        }
        return bookingDates;
    }

    private List<String> deleteWeek(String[] dates) {
        List<String> result = new ArrayList<String>();
        for (String date : dates) {
            String[] sequence = date.split("\\(");
            result.add(sequence[0]);
        }
        return result;
    }
}
