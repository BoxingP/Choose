package com.boxing.unit;

import java.util.List;

public class HotelChooser {

    public String choose(List<Hotel> hotelList, HotelBooking booking) {

        String hotelName = hotelList.get(0).getHotelName();
        int minimumTotalPrice = hotelList.get(0).getPrice(booking);

        for (Hotel hotel : hotelList) {
            int totalPrice = hotel.getPrice(booking);
            if (totalPrice < minimumTotalPrice) {
                minimumTotalPrice = totalPrice;
                hotelName = hotel.getHotelName();
            }
            if (totalPrice == minimumTotalPrice) {
                hotelName = hotel.getHotelName();
            }
        }
        return hotelName;
    }
}
