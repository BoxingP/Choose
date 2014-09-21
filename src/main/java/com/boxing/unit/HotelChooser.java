package com.boxing.unit;

public class HotelChooser {
    public String choose(String clientClass, int weekdayAmount, int weekendAmount) {
        int[] hotelPrice=new int[3];
        if (clientClass.equals("Regular")) {
            hotelPrice[0] = 110*weekdayAmount+80*weekendAmount;
            hotelPrice[1] = 160*weekdayAmount+60*weekendAmount;
            hotelPrice[2] = 220*weekdayAmount+150*weekendAmount;
        }
        if (clientClass.equals("Rewards")) {
            hotelPrice[0] = 80*weekdayAmount+80*weekendAmount;
            hotelPrice[1] = 110*weekdayAmount+50*weekendAmount;
            hotelPrice[2] = 100*weekdayAmount+40*weekendAmount;
        }
        int cheapPrice=hotelPrice[0];
        int index=0;
        for (int i=0;i<hotelPrice.length;i++) {
            if (hotelPrice[i]<cheapPrice) {
                cheapPrice=hotelPrice[i];
                index=i;
            }
        }
        switch (index) {
            case 0: return "Lakewood";
            case 1: return "Bridgewood";
            case 2: return "Ridgewood";
        }
        return null;
    }
}
