package com.boxing.unit;

import com.boxing.hotelSystem.HotelBooking;

import java.util.List;

public class HotelChooser {


    public Hotel choose(List<Hotel> hotelList, HotelBooking booking) {
        Hotel expectHotel = hotelList.get(0);

        for (Hotel aHotel : hotelList) {
            expectHotel = chooseCheaperHotel(expectHotel, aHotel, booking);
        }
        return expectHotel;
    }

    private Hotel chooseCheaperHotel(Hotel hotelA, Hotel hotelB, HotelBooking booking) {
        int hotelAPrice = hotelA.getPrice(booking);
        int hotelBPrice = hotelB.getPrice(booking);

        if (hotelBPrice < hotelAPrice) {
            return hotelB;
        }
        if (hotelBPrice == hotelAPrice) {
            return chooseHigherRatingHotel(hotelA, hotelB);
        }
        return hotelA;
    }

    private Hotel chooseHigherRatingHotel(Hotel hotelA, Hotel hotelB) {
        return hotelB.getRating().ordinal() > hotelA.getRating().ordinal() ? hotelB : hotelA;
    }
}
