package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OutputTest {
    @Test
    public void outputShouldReturnAString() {
        Output output = new Output();
        assertThat(output.output("Bye."), is("Bye."));
    }
}
