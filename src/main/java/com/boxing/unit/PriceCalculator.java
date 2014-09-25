package com.boxing.unit;

public class PriceCalculator {
//
    public int calculate(String clientClass, int weekdayAmount, int weekendAmount, Price unitPrice) {
        return unitPrice.getWeekday(clientClass) * weekdayAmount + unitPrice.getWeekend(clientClass) * weekendAmount;
    }

}
