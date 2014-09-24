package com.boxing.unit;

import java.util.Arrays;
import java.util.List;

public class HotelChooser {
    private HotelBooking booking;

    public HotelChooser(HotelBooking booking) {
        this.booking = booking;
    }

    public String choose() {

        List<Integer> hotelPrice = getHotelPrice();

        int cheapPrice = hotelPrice.get(0);
        int index = 0;
        for (int i = 0; i < hotelPrice.size(); i++) {
            if (hotelPrice.get(i) < cheapPrice) {
                cheapPrice = hotelPrice.get(i);
                index = i;
            }
            if (hotelPrice.get(i) == cheapPrice) {
                index = i;
            }
        }
        switch (index) {
            case 0:
                return "Lakewood";
            case 1:
                return "Bridgewood";
            case 2:
                return "Ridgewood";
        }
        return null;
    }

    private List<Hotel> creatHotelListing() {
        Hotel lakewood = new Hotel("Lakewood", 110, 90, 80, 80, booking);
        Hotel bridgewood = new Hotel("Bridgewood", 160, 60, 110, 50, booking);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150, 100, 40, booking);
        return Arrays.asList(lakewood,bridgewood,ridgewood);
    }

    private List getHotelPrice() {
        List<Hotel> hotelListing = creatHotelListing();
        List<Integer> hotelPrice = Arrays.asList(hotelListing.get(0).getPrice(), hotelListing.get(1).getPrice(), hotelListing.get(2).getPrice());
        return hotelPrice;
    }

}
