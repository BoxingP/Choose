package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChooserTest {
    @Test
    public void thereIsThreeNumbersShouldReturnTheMinimum() {
        Chooser chooser = new Chooser();
        assertThat(chooser.choose(new int[] {2,3,4}),is(2));
    }
}
