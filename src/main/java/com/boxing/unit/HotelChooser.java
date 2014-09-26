package com.boxing.unit;

import java.util.List;

public class HotelChooser {

    public Hotel choose(List<Hotel> hotelList, HotelBooking booking) {

        Hotel hotel = hotelList.get(0);
        int minimumTotalPrice = hotel.getPrice(booking);
        int hotelRating = hotel.getRating();

        for (Hotel aHotel : hotelList) {
            int totalPrice = aHotel.getPrice(booking);
            if (totalPrice <= minimumTotalPrice) {
                minimumTotalPrice = totalPrice;
                if (hotelRating < aHotel.getRating())
                    hotel = aHotel;
            }
        }
        return hotel;
    }
}
