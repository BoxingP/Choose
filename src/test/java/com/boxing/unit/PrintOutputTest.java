package com.boxing.unit;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrintOutputTest {
    @Test
    public void resultIsLakewood_shouldReturn_lakewood() {
        PrintOutput printOutput = new PrintOutput();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String separator = System.getProperty("line.separator");
        printOutput.print("Lakewood");
        assertThat(output.toString(), is("Lakewood" + separator));
    }
}
