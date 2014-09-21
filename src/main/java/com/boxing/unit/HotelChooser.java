package com.boxing.unit;

public class HotelChooser {
    public String choose(String clientClass, int weekdayAmount, int weekendAmount) {
        int[] hotelPrice=new int[3];
        PriceCalculator priceCalculator = new PriceCalculator();
        hotelPrice[0]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,"LAKEWOOD");
        hotelPrice[1]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,"BRIDGEWOOD");
        hotelPrice[2]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,"RIDGEWOOD");


        int cheapPrice=hotelPrice[0];
        int index=0;
        for (int i=0;i<hotelPrice.length;i++) {
            if (hotelPrice[i]<cheapPrice) {
                cheapPrice=hotelPrice[i];
                index=i;
            }
            if (hotelPrice[i]==cheapPrice) {
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
