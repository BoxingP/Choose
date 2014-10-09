package com.boxing.unit;

import com.boxing.hotelSystem.HotelBooking;

public class Price {
    private int regularWeekdayUnitPrice;
    private int regularWeekendUnitPrice;
    private int rewardsWeekdayUnitPrice;
    private int rewardsWeekendUnitPrice;

    public Price(int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice) {
        this.regularWeekdayUnitPrice = regularWeekdayUnitPrice;
        this.regularWeekendUnitPrice = regularWeekendUnitPrice;
        this.rewardsWeekdayUnitPrice = rewardsWeekdayUnitPrice;
        this.rewardsWeekendUnitPrice = rewardsWeekendUnitPrice;
    }

    public int getTotalPrice(HotelBooking booking) {
        CustomerType customerType = booking.getCustomerType();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        return getWeekdayUnitPrice(customerType) * weekdayAmount + getWeekendUnitPrice(customerType) * weekendAmount;
    }

    private int getWeekdayUnitPrice(CustomerType customerType) {
        return isRewards(customerType) ? rewardsWeekdayUnitPrice : regularWeekdayUnitPrice;
    }

    private int getWeekendUnitPrice(CustomerType customerType) {
        return isRewards(customerType) ? rewardsWeekendUnitPrice : regularWeekendUnitPrice;
    }

    private boolean isRewards(CustomerType customerType) {
        return customerType == CustomerType.REWARDS;
    }
}