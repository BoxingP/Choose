package com.boxing.hotel.unit;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookingParsingTest {
    BookingParsing bookingParsing;

    @Before
    public void initObject() {
        bookingParsing = new BookingParsing();
    }

    @Test
    public void shouldPeopleIsRegular_return_regularCustomerType() throws ParseException {
        assertThat(bookingParsing.getCustomerType("Regular: 22Sep2014(mon)"), is(CustomerType.REGULAR));
    }

    @Test
    public void shouldString22Sep2014_return_calendar() throws ParseException{
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.SEPTEMBER, 22);

        List<Calendar> convertCalendar=bookingParsing.getDates("Regular: 22Sep2014(mon)");
        assertThat(convertCalendar.get(0).get(Calendar.YEAR), is(calendar.get(Calendar.YEAR)));
        assertThat(convertCalendar.get(0).get(Calendar.MONTH), is(calendar.get(Calendar.MONTH)));
        assertThat(convertCalendar.get(0).get(Calendar.DATE), is(calendar.get(Calendar.DATE)));
    }

    @Test
    public void shouldString22Sep201427Sep2014_return_listOfCalendar() throws ParseException{
        Calendar calendar22Sep = Calendar.getInstance();
        calendar22Sep.set(2014, Calendar.SEPTEMBER, 22);
        Calendar calendar27Sep = Calendar.getInstance();
        calendar27Sep.set(2014, Calendar.SEPTEMBER, 27);

        List<Calendar> convertCalendar=bookingParsing.getDates("Regular: 22Sep2014(mon), 27Sep2014(sat)");
        assertThat(convertCalendar.get(0).get(Calendar.YEAR), is(calendar22Sep.get(Calendar.YEAR)));
        assertThat(convertCalendar.get(0).get(Calendar.MONTH), is(calendar22Sep.get(Calendar.MONTH)));
        assertThat(convertCalendar.get(0).get(Calendar.DATE), is(calendar22Sep.get(Calendar.DATE)));

        assertThat(convertCalendar.get(1).get(Calendar.YEAR), is(calendar27Sep.get(Calendar.YEAR)));
        assertThat(convertCalendar.get(1).get(Calendar.MONTH), is(calendar27Sep.get(Calendar.MONTH)));
        assertThat(convertCalendar.get(1).get(Calendar.DATE), is(calendar27Sep.get(Calendar.DATE)));
    }
}
