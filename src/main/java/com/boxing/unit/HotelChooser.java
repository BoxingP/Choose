package com.boxing.unit;

import java.util.ArrayList;
import java.util.List;

public class HotelChooser {

    public String choose(List<Hotel> hotelListing) {

        List<Integer> hotelPrice=new ArrayList<Integer>();
        for (Hotel hotel:hotelListing) {
            int totalPrice= hotel.getPrice();
            hotelPrice.add(totalPrice);
        }

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
        return hotelListing.get(index).getHotelName();
    }
}
