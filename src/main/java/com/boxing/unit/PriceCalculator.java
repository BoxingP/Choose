package com.boxing.unit;

public class PriceCalculator {
    private enum Hotel {
        LAKEWOOD(110, 90, 80, 80), BRIDGEWOOD(160, 60, 110, 50), RIDGEWOOD(220, 150, 100, 40);

        private int regularWeekdayUnitPrice;
        private int regularWeekendUnitPrice;
        private int rewardsWeekdayUnitPrice;
        private int rewardsWeekendUnitPrice;

        Hotel(int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice) {
            this.regularWeekdayUnitPrice = regularWeekdayUnitPrice;
            this.regularWeekendUnitPrice = regularWeekendUnitPrice;
            this.rewardsWeekdayUnitPrice = rewardsWeekdayUnitPrice;
            this.rewardsWeekendUnitPrice = rewardsWeekendUnitPrice;
        }
    }

    public int calculate(String clientClass, int weekdayAmount, int weekendAmount, String hotelName) {
        int price=0;
        Hotel hotel=Hotel.valueOf(hotelName);
        if (clientClass.equals("Regular")) {
            price =hotel.regularWeekdayUnitPrice*weekdayAmount+hotel.regularWeekendUnitPrice*weekendAmount;
        }
        if (clientClass.equals("Rewards")) {
            price =hotel.rewardsWeekdayUnitPrice*weekdayAmount+hotel.rewardsWeekendUnitPrice*weekendAmount;
        }
        return price;
    }
}
