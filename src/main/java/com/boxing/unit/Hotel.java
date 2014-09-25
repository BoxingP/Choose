package com.boxing.unit;

public class Hotel {
    private HotelBooking booking;
    private String name;
    private Price price;

    public Hotel(HotelBooking booking, String name, Price price) {
        this.booking = booking;
        this.name = name;
        this.price = price;
    }

    public String getHotelName() {
        return name;
    }

    public int getPrice() {
//        price.calculate();
        PriceCalculator priceCalculator = new PriceCalculator();
        String clientLevel = booking.getClientLevel();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();

        return priceCalculator.calculate(clientLevel, weekdayAmount, weekendAmount, price);
    }

}
