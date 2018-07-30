package com.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberProcessorTest {

    @Test
    public void shouldFilterOdd() {
        assertThat(new NumberProcessor().process("1 2 3 4 5"),is("1 3 5"));
    }


}
