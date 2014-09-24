package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriceCalculatorTest {
    @Test
    public void aRegularWith1Weekday_shouldReturn_110() {
        int regularWeekdayUnitPrice=110;
        int regularWeekendUnitPrice=100;
        int rewardsWeekdayUnitPrice=90;
        int rewardsWeekendUnitPrice=80;
        assertThat(new PriceCalculator().calculate("Regular", 1, 0, regularWeekdayUnitPrice, regularWeekendUnitPrice, rewardsWeekdayUnitPrice, rewardsWeekendUnitPrice), is(110));
    }
}
