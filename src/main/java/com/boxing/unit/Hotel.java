package com.boxing.unit;

public class Hotel {
    private String hotelName;
    private int regularWeekdayUnitPrice;
    private int regularWeekendUnitPrice;
    private int rewardsWeekdayUnitPrice;
    private int rewardsWeekendUnitPrice;

    public Hotel(String hotelName, int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice) {
        this.hotelName = hotelName;
        this.regularWeekdayUnitPrice = regularWeekdayUnitPrice;
        this.regularWeekendUnitPrice = regularWeekendUnitPrice;
        this.rewardsWeekdayUnitPrice = rewardsWeekdayUnitPrice;
        this.rewardsWeekendUnitPrice = rewardsWeekendUnitPrice;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRegularWeekdayUnitPrice() {
        return regularWeekdayUnitPrice;
    }

    public int getRegularWeekendUnitPrice() {
        return regularWeekendUnitPrice;
    }

    public int getRewardsWeekdayUnitPrice() {
        return rewardsWeekdayUnitPrice;
    }

    public int getRewardsWeekendUnitPrice() {
        return rewardsWeekendUnitPrice;
    }
}
