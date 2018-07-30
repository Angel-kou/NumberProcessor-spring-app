package com.thoughtworks.training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testShouldReturn0() {
        assertThat(new App().test(),is(0));
    }


}