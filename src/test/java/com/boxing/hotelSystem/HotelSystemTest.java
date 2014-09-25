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
        String separator = System.getProperty("line.separator");
        assertThat(output, is("Lakewood" + separator));
    }

    @Test
    public void aRegularWithFriSatSunBookInformation_shouldReturn_bridgewood() {
        String bookInformation = "Regular: 26Sep2014(fri), 27Sep2014(sat), 28Sep2014(sun)";
        String[] args = new String[]{bookInformation};
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String separator = System.getProperty("line.separator");
        assertThat(output, is("Bridgewood" + separator));
    }

    @Test
    public void aRewardsWithThurFriSatBookInformation_shouldReturn_ridgewood() {
        String bookInformation = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        String[] args = new String[]{bookInformation};
        hotelSystem.main(args);
        String output = this.outputStream.toString();
        String separator = System.getProperty("line.separator");
        assertThat(output, is("Ridgewood" + separator));
    }
}
