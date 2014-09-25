package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriceCalculatorTest {
    @Test
    public void aRegularWith1Weekday_shouldReturn_110() {
        Price price = new Price(110, 100, 90, 80);
        assertThat(new PriceCalculator().calculate("Regular", 1, 0, price), is(110));
    }
}
