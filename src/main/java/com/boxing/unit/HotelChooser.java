package com.boxing.unit;

import java.util.Arrays;
import java.util.List;

public class HotelChooser {
    private HotelBooking booking;

    public HotelChooser(HotelBooking booking) {
        this.booking = booking;
    }


    public String choose() {

        int[] hotelPrice = getHotelPrice();

        int cheapPrice = hotelPrice[0];
        int index = 0;
        for (int i = 0; i < hotelPrice.length; i++) {
            if (hotelPrice[i] < cheapPrice) {
                cheapPrice = hotelPrice[i];
                index = i;
            }
            if (hotelPrice[i] == cheapPrice) {
                index = i;
            }
        }
        List<Hotel> hotelListing = getHotelListing();
        switch (index) {
            case 0:
                return hotelListing.get(0).getHotelName();
            case 1:
                return hotelListing.get(1).getHotelName();
            case 2:
                return hotelListing.get(2).getHotelName();
        }
        return null;
    }

    private List getHotelListing() {
        Hotel lakewood = new Hotel("Lakewood", 110, 90, 80, 80);
        Hotel bridgewood = new Hotel("Bridgewood", 160, 60, 110, 50);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150, 100, 40);
        List<Hotel> hotelListing = Arrays.asList(lakewood, bridgewood, ridgewood);
        return hotelListing;
    }

    private int[] getHotelPrice() {
        List<Hotel> hotelListing = getHotelListing();
        PriceCalculator priceCalculator = new PriceCalculator();
        int[] hotelPrice = new int[hotelListing.size()];
        String clientClass = booking.getClientClass();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();
        int index = 0;

        for (Hotel hotel : hotelListing) {
            hotelPrice[index] = priceCalculator.calculate(clientClass, weekdayAmount, weekendAmount, hotel);
            index++;
        }
        return hotelPrice;
    }
}
