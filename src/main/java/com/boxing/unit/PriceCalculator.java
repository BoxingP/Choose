package com.boxing.unit;

public class PriceCalculator {

    public int calculate(String clientClass, int weekdayAmount, int weekendAmount, Hotel hotel) {
        int price=0;
        if (clientClass.equals("Regular")) {
            price =hotel.getRegularWeekdayUnitPrice()*weekdayAmount+hotel.getRegularWeekendUnitPrice()*weekendAmount;
        }
        if (clientClass.equals("Rewards")) {
            price =hotel.getRewardsWeekdayUnitPrice()*weekdayAmount+hotel.getRewardsWeekendUnitPrice()*weekendAmount;
        }
        return price;
    }
}
