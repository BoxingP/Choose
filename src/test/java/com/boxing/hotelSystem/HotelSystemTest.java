package com.boxing.hotelSystem;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HotelSystemTest {
    private HotelSystem hotelSystem;
    private ByteArrayOutputStream outputStream;
    private String separator = System.getProperty("line.separator");;

    @Before
    public void initObject() {
        hotelSystem = new HotelSystem();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void aRegularWithMonTuesWedBookInformation_shouldReturn_lakewood() {
        String bookInformation = "Regular: 22Sep2014(mon), 23Sep2014(tues), 24Sep2014(wed)";
        String[] args = new String[]{bookInformation};
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String expectHotelName = "Lakewood" + separator;

        assertThat(output, is(expectHotelName));
    }
}
