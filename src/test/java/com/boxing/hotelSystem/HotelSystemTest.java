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
    private String[] args;
    private String separator;

    @Before
    public void initObject() {
        hotelSystem = new HotelSystem();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        args=new String[1];
        separator = System.getProperty("line.separator");
    }

    @Test
    public void aRegularWithMonTuesWedBookInformation_shouldReturn_lakewood() {
        String bookInformation = "Regular: 22Sep2014(mon), 23Sep2014(tues), 24Sep2014(wed)";
        args[0] = bookInformation;
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String expectHotelName = "Lakewood" + separator;

        assertThat(output, is(expectHotelName));
    }

    @Test
    public void aRegularWithFriSatSunBookInformation_shouldReturn_bridgewood() {
        String bookInformation = "Regular: 26Sep2014(fri), 27Sep2014(sat), 28Sep2014(sun)";
        args[0] = bookInformation;
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String expectHotelName = "Bridgewood" + separator;

        assertThat(output, is(expectHotelName));
    }

    @Test
    public void aRewardsWithThurFriSatBookInformation_shouldReturn_ridgewood() {
        String bookInformation = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        args[0] = bookInformation;
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String expectHotelName = "Ridgewood" + separator;

        assertThat(output, is(expectHotelName));
    }
}
