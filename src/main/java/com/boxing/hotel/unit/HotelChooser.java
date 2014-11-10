package com.boxing.hotel.unit;

import java.text.ParseException;
import java.util.List;

public class HotelChooser {

    public Hotel choose(List<Hotel> HotelListing, BookInformation bookingInformation) throws ParseException {
        Hotel expectHotel = HotelListing.get(0);

        for (Hotel aHotel : HotelListing) {
            expectHotel = chooseCheaperHotel(expectHotel, aHotel, bookingInformation);
        }
        return expectHotel;
    }

    private Hotel chooseCheaperHotel(Hotel hotelA, Hotel hotelB, BookInformation bookingInformation) throws ParseException {
        CalculatingRule calculatingRule = new CalculatingRule();

        int hotelAPrice = calculatingRule.getTotalPrice(bookingInformation, hotelA);
        int hotelBPrice = calculatingRule.getTotalPrice(bookingInformation, hotelB);

        if (hotelBPrice < hotelAPrice) {
            return hotelB;
        }
        if (hotelBPrice == hotelAPrice) {
            return chooseHigherRatingHotel(hotelA, hotelB);
        }
        return hotelA;
    }

    private Hotel chooseHigherRatingHotel(Hotel hotelA, Hotel hotelB) {
        return hotelB.getRating() > hotelA.getRating() ? hotelB : hotelA;
    }
}
