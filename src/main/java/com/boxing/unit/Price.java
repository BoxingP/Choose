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
        ClientLevel clientLevel = booking.getClientLevel();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        return getWeekdayUnitPrice(clientLevel) * weekdayAmount + getWeekendUnitPrice(clientLevel) * weekendAmount;
    }

    private int getWeekdayUnitPrice(ClientLevel clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekdayUnitPrice : regularWeekdayUnitPrice;
    }

    private int getWeekendUnitPrice(ClientLevel clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekendUnitPrice : regularWeekendUnitPrice;
    }

    private boolean isRewards(ClientLevel clientLevel) {
        return clientLevel==ClientLevel.REWARDS;
    }
}