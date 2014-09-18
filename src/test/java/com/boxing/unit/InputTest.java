package com.boxing.unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InputTest {
    @Test
    public void inputAStringShouldReturnItself() {
        Input input = new Input();
        assertThat(input.input("Hello world!"), is("Hello world!"));
    }
}
