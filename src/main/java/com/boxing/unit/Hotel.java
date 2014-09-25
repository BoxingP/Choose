package com.boxing.unit;

public class Hotel {
    private String name;
    private Price price;

    public Hotel(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getHotelName() {
        return name;
    }

    public int getPrice(HotelBooking booking) {
        return price.getTotalPrice(booking);
    }

}
