package com.boxing.unit;

public class Hotel {
    private String name;
    private Price price;
    private HotelRating rating;

    public Hotel(String name, Price price, HotelRating rating) {
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

    public HotelRating getRating() {
        return rating;
    }
}