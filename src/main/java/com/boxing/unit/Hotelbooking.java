package com.boxing.unit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HotelBooking {
    private CustomerType customerType;
    private List<Calendar> dates;

    public HotelBooking(String bookInformation) throws ParseException {
        customerType = getCustomerType(bookInformation);
        dates = getDates(bookInformation);
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

    private CustomerType getCustomerType(String bookInformation) {
        String[] information = bookInformation.split(": ");
        return CustomerType.valueOf(information[0].toUpperCase());
    }


    private List<Calendar> getDates(String bookInformation) throws ParseException {
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

    private boolean isWeekend(Calendar date) {
        int i = date.get(Calendar.DAY_OF_WEEK);
        return (i == Calendar.SATURDAY || i == Calendar.SUNDAY);
    }
}
