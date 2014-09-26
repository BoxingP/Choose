package com.boxing.unit;

public class Hotel {
    private String name;
    private Price price;
    private int rating;

    public Hotel(String name, Price price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getHotelName() {
        return name;
    }

    public int getPrice(HotelBooking booking) {
        return price.getTotalPrice(booking);
    }

    public int getRating() {
        return rating;
    }
}