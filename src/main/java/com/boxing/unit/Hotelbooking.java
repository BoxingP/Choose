package com.boxing.unit;

public class HotelBooking {
    private String[] weekday = new String[]{"mon", "tues", "wed", "thur", "fri"};
    private String[] weekend = new String[]{"sat", "sun"};

    public int getWeekdayAmount(String date) {
        for (int i = 0; i < weekday.length; i++) {
            if (date.contains(weekday[i]))
                return 1;
        }
        return 0;
    }

    public int getWeekendAmount(String date) {
        for (int i = 0; i < weekend.length; i++) {
            if (date.contains(weekend[i]))
                return 1;
        }
        return 0;
    }

    public String getClientClass(String bookInformation) {
        String[] Information = bookInformation.split(": ");
        return Information[0];
    }
}
