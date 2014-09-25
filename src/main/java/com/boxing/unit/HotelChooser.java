package com.boxing.unit;

import java.util.List;

public class HotelChooser {

    public Hotel choose(List<Hotel> hotelList, HotelBooking booking) {

        Hotel hotel = hotelList.get(0);
        int minimumTotalPrice = hotel.getPrice(booking);

        for (Hotel aHotel : hotelList) {
            int totalPrice = aHotel.getPrice(booking);
            if (totalPrice < minimumTotalPrice || totalPrice == minimumTotalPrice) {
                minimumTotalPrice = totalPrice;
                hotel = aHotel;
            }
        }
        return hotel;
    }
}
