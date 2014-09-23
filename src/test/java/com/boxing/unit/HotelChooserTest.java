package com.boxing.unit;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelChooserTest {
    HotelChooser hotelChooser;

    @Before
    public void initObject() {
        hotelChooser = new HotelChooser();
    }

    @Test
    public void aRegular1Weekday_shouldReturn_lakewood() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 1;
            }

            public int getWeekendAmount() {
                return 0;
            }

            public String getClientClass() {
                return "Regular";
            }
        };
        assertThat(hotelChooser.choose(booking), is("Lakewood"));
    }

    @Test
    public void aRewards1Weekday_shouldReturn_lakewood() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 1;
            }

            public int getWeekendAmount() {
                return 0;
            }

            public String getClientClass() {
                return "Regular";
            }
        };
        assertThat(hotelChooser.choose(booking), is("Lakewood"));
    }

    @Test
    public void aRegular1Weekend_shouldReturn_bridgewood() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 0;
            }

            public int getWeekendAmount() {
                return 1;
            }

            public String getClientClass() {
                return "Regular";
            }
        };
        assertThat(hotelChooser.choose(booking), is("Bridgewood"));
    }

    @Test
    public void aRewards1Weekend_shouldReturn_ridgewood() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 0;
            }

            public int getWeekendAmount() {
                return 1;
            }

            public String getClientClass() {
                return "Rewards";
            }
        };
        assertThat(hotelChooser.choose(booking), is("Ridgewood"));
    }

    @Test
    public void aRegular3Weekday5Weekend_shouldReturn_Bridgewood() {
        HotelBooking booking = new HotelBooking() {
            public int getWeekdayAmount() {
                return 3;
            }

            public int getWeekendAmount() {
                return 5;
            }

            public String getClientClass() {
                return "Regular";
            }
        };
        assertThat(hotelChooser.choose(booking), is("Bridgewood"));
    }
}
