package com.boxing.unit;

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
        String clientLevel = booking.getClientLevel();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        return getWeekdayUnitPrice(clientLevel) * weekdayAmount + getWeekendUnitPrice(clientLevel) * weekendAmount;
    }

    private int getWeekdayUnitPrice(String clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekdayUnitPrice : regularWeekdayUnitPrice;
    }

    private int getWeekendUnitPrice(String clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekendUnitPrice : regularWeekendUnitPrice;
    }

    private boolean isRewards(String clientLevel) {
        return clientLevel.toUpperCase().equals(ClientLevel.REWARDS.name());
    }

}