package com.boxing.unit;

public class HotelBooking {
    private String clientClass;
    private String[] dates;

    public HotelBooking() {}

    public HotelBooking(String bookInformation) {
        divideInformation(bookInformation);
    }

    public int getWeekdayAmount() {
        int weekdayAmount=0;
        for (String date:dates) {
            if (isWeekday(date)) weekdayAmount++;
        }
        return weekdayAmount;
    }

    public int getWeekendAmount() {
        int weekendAmount=0;
        for (String date:dates) {
            if (isWeekend(date)) weekendAmount++;
        }
        return weekendAmount;
    }

    public String getClientClass() {
        return clientClass;
    }

    public String[] getDates() {
        return dates;
    }

    private void divideInformation(String bookInformation) {
        String[] Information = bookInformation.split(": ");
        clientClass = Information[0];
        dates = Information[1].split(",");
    }

    private boolean isWeekday(String date) {
        final String[] weekday = new String[]{"mon", "tues", "wed", "thur", "fri"};
        for (String aWeekend : weekday) {
            if (date.contains(aWeekend))
                return true;
        }
        return false;
    }

    private boolean isWeekend(String date) {
        final String[] weekend = new String[]{"sat", "sun"};
        for (String aWeekend : weekend) {
            if (date.contains(aWeekend))
                return true;
        }
        return false;
    }
}
