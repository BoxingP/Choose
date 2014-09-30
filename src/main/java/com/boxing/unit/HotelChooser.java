package com.boxing.unit;

import java.util.List;

public class HotelChooser {
    private Hotel expectHotel;

    public Hotel choose(List<Hotel> hotelList, HotelBooking booking) {

        expectHotel = hotelList.get(0);

        for (Hotel aHotel : hotelList) {
            chooseCheaperHotel(expectHotel, aHotel, booking);
        }
        return expectHotel;
    }

    private void chooseCheaperHotel(Hotel hotelA, Hotel hotelB, HotelBooking booking) {
        if (hotelB.getPrice(booking) <= hotelA.getPrice(booking)) {
            expectHotel = chooseHigherRatingHotel(hotelA, hotelB);
        }
    }

    private Hotel chooseHigherRatingHotel(Hotel hotelA, Hotel hotelB) {
        return hotelB.getRating() > hotelA.getRating() ? hotelB : hotelA;
    }
}
