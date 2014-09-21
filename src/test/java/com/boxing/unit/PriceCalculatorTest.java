package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriceCalculatorTest {
    @Test
    public void aRegularWith1WeekdayInLakewood_shouldReturn_110() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.calculate("Regular",1,0,"LAKEWOOD"), is(110));
    }
}
