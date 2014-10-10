package com.boxing.hotel.hotelSystem;

import com.boxing.hotel.unit.BookingParsing;
import com.boxing.hotel.unit.CustomerType;
import com.boxing.hotel.unit.Hotel;
import com.boxing.hotel.unit.Price;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

public class CalculatingRule {

    public int getTotalPrice(String bookInformation, Hotel hotel) throws ParseException {
        BookingParsing bookingParsing = new BookingParsing();
        CustomerType customerType = bookingParsing.getCustomerType(bookInformation);
        List<Calendar> dates = bookingParsing.getDates(bookInformation);

        int weekendAmount = getWeekendAmount(dates);
        int weekdayAmount = dates.size() - weekendAmount;

        Price price = hotel.getPrice();
        int weekdayUnitPrice = isRewards(customerType) ? price.getRewardsWeekdayUnitPrice() : price.getRegularWeekdayUnitPrice();
        int weekendUnitPrice = isRewards(customerType) ? price.getRewardsWeekendUnitPrice() : price.getRegularWeekendUnitPrice();

        return weekdayUnitPrice * weekdayAmount + weekendUnitPrice * weekendAmount;
    }

    private boolean isRewards(CustomerType customerType) {
        return customerType == CustomerType.REWARDS;
    }

    private int getWeekendAmount(List<Calendar> dates) throws ParseException {

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
