package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriceTest {
    Price price;

    @Before
    public void initObject() {
        price = new Price(110, 100, 90, 80);
    }

    @Test
    public void shouldRegularInWeekday_return_110() {
        assertThat(price.getWeekday("Regular"), is(110));
    }

    @Test
    public void shouldRegularInWeekend_return_100() {
        assertThat(price.getWeekend("Regular"), is(100));
    }

    @Test
    public void shouldRewardsInWeekday_return_90() {
        assertThat(price.getWeekday("Rewards"), is(90));
    }

    @Test
    public void shouldRewardsInWeekend_return_80() {
        assertThat(price.getWeekend("Rewards"), is(80));
    }
}
