package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriceCalculatorTest {
    @Test
    public void aRegularWith1WeekdayInHotel_shouldReturn_110() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Hotel hotel= new Hotel() {
            public String getHotelName() {
                return "a";
            }

            public int getRegularWeekdayUnitPrice() {
                return 110;
            }

            public int getRegularWeekendUnitPrice() {
                return 100;
            }

            public int getRewardsWeekdayUnitPrice() {
                return 90;
            }

            public int getRewardsWeekendUnitPrice() {
                return 80;
            }

        };

        assertThat(priceCalculator.calculate("Regular",1,0,hotel), is(110));
    }
}
