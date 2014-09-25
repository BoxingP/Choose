package com.boxing.unit;

public class Hotel {
    private HotelBooking booking;
    private Price price;

    public Hotel(HotelBooking booking, Price price) {
        this.price = price;
        this.booking = booking;
    }

    public int getPrice() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String clientLevel = booking.getClientLevel();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();

        return priceCalculator.calculate(clientLevel, weekdayAmount, weekendAmount, price);
    }

}
