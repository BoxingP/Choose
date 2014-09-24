package com.boxing.unit;

public class Hotel {
    private String hotelName;
    private int regularWeekdayUnitPrice;
    private int regularWeekendUnitPrice;
    private int rewardsWeekdayUnitPrice;
    private int rewardsWeekendUnitPrice;
    private HotelBooking booking;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel(String hotelName, int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice, HotelBooking booking) {
        this.hotelName = hotelName;
        this.regularWeekdayUnitPrice = regularWeekdayUnitPrice;
        this.regularWeekendUnitPrice = regularWeekendUnitPrice;
        this.rewardsWeekdayUnitPrice = rewardsWeekdayUnitPrice;
        this.rewardsWeekendUnitPrice = rewardsWeekendUnitPrice;
        this.booking = booking;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getPrice() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String clientClass = booking.getClientClass();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();

        return priceCalculator.calculate(clientClass, weekdayAmount, weekendAmount, regularWeekdayUnitPrice, regularWeekendUnitPrice, rewardsWeekdayUnitPrice, rewardsWeekendUnitPrice);
    }
}
