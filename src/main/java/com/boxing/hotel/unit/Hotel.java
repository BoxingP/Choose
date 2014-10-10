package com.boxing.hotel.unit;

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

    public Price getPrice() {
        return price;
    }

    public int getRating() {
        return rating.ordinal();
    }
}