package com.boxing.unit;

public class HotelBooking {
    private String clientLevel;
    private String[] dates;

    public HotelBooking(String bookInformation) {
        divideInformation(bookInformation);
    }

    public ClientLevel getClientLevel() {
        return clientLevel.toUpperCase().equals(ClientLevel.REWARDS.name()) ? ClientLevel.REWARDS : ClientLevel.REGULAR;
    }

    public int getWeekdayAmount() {
        int weekdayAmount = 0;
        for (String date : dates) {
            if (isWeekday(date)) weekdayAmount++;
        }
        return weekdayAmount;
    }

    public int getWeekendAmount() {
        return dates.length - getWeekdayAmount();
    }

    private void divideInformation(String bookInformation) {
        String[] information = bookInformation.split(": ");
        clientLevel = information[0];
        dates = information[1].split(",");
    }

    private boolean isWeekday(String date) {
        final String[] weekday = new String[]{"mon", "tues", "wed", "thur", "fri"};
        for (String aWeekend : weekday) {
            if (date.contains(aWeekend))
                return true;
        }
        return false;
    }
}
