package com.boxing.unit;

public class HotelChooser {

    public String choose(HotelBooking booking) {
        int[] hotelPrice=new int[3];
        PriceCalculator priceCalculator = new PriceCalculator();
        Hotel lakewood = new Hotel("Lakewood",110,90,80,80);
        Hotel bridgewood = new Hotel("Bridgewood",160,60,110,50);
        Hotel ridgewood = new Hotel("Ridgewood",220,150,100,40);

        String clientClass = booking.getClientClass();
        int weekdayAmount = booking.getWeekdayAmount();
        int weekendAmount = booking.getWeekendAmount();

        hotelPrice[0]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,lakewood);
        hotelPrice[1]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,bridgewood);
        hotelPrice[2]=priceCalculator.calculate(clientClass,weekdayAmount,weekendAmount,ridgewood);


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
            case 0: return lakewood.getHotelName();
            case 1: return bridgewood.getHotelName();
            case 2: return ridgewood.getHotelName();
        }
        return null;
    }
}
