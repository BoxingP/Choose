package com.boxing.hotel.unit;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

public class CalculatingRule {

    public int getTotalPrice(BookInformation bookInformation, Hotel hotel) throws ParseException {
        CustomerType customerType = bookInformation.getCustomerType();
        List<Calendar> dates = bookInformation.getBookingDates();

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
