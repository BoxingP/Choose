package com.boxing.unit;

public class Price {
    private int regularWeekdayUnitPrice;
    private int regularWeekendUnitPrice;
    private int rewardsWeekdayUnitPrice;
    private int rewardsWeekendUnitPrice;

    public Price(int regularWeekdayUnitPrice, int regularWeekendUnitPrice, int rewardsWeekdayUnitPrice, int rewardsWeekendUnitPrice) {
        this.regularWeekdayUnitPrice = regularWeekdayUnitPrice;
        this.regularWeekendUnitPrice = regularWeekendUnitPrice;
        this.rewardsWeekdayUnitPrice = rewardsWeekdayUnitPrice;
        this.rewardsWeekendUnitPrice = rewardsWeekendUnitPrice;
    }

    public int getWeekday(String clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekdayUnitPrice : regularWeekdayUnitPrice;
    }

    public int getWeekend(String clientLevel) {
        return isRewards(clientLevel) ? rewardsWeekendUnitPrice : regularWeekendUnitPrice;
    }

    private boolean isRewards(String clientLevel) {
        return clientLevel.equals("Rewards");
    }

}