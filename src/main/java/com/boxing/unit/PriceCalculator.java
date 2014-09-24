package com.boxing.unit;

public class PriceCalculator {

    public int calculate(String clientClass, int weekdayAmount, int weekendAmount, int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice) {
        int price = 0;
        if (clientClass.equals("Regular")) {
            price = regularWeekdayUnitPrice * weekdayAmount + regularWeekendUnitPrice * weekendAmount;
        }
        if (clientClass.equals("Rewards")) {
            price = rewardsWeekdayUnitPrice * weekdayAmount + rewardsWeekendUnitPrice * weekendAmount;
        }
        return price;
    }
}
