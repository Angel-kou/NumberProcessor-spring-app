package com.thoughtworks.training;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProcesserTest {

    List<Integer> input = new ArrayList<>();
    int number =0;

    @Before
    public void beforeEach() {
        input = ImmutableList.of(1,2,3,4,5);
        number = 2;
    }

    @Test
    public void shouldReturnAddValue1() {
        List<Integer> output = IntStream.of(3,4,5,6,7).boxed().collect(Collectors.toList());
        Processer processer = new AddProcessor();
        assertThat(processer.process(input,number),is(output));
    }

    @Test
    public void shouldReturnAddValue() {
        List<Integer> result = Arrays.asList(3,4,5,6,7);
        Processer processer = new AddProcessor();
        assertThat(processer.process(input,number),is(result));
    }

    @Test
    public void shouldReturnSubValue() {
        List<Integer> result = Arrays.asList(-1,0,1,2,3);
        Processer processer = new SubProcessor();
        assertThat(processer.process(input,number),is(result));
    }

    @Test
    public void shouldReturnMutilValue() {
        List<Integer> result = Arrays.asList(2,4,6,8,10);
        Processer processer = new MutilProcesser();
        assertThat(processer.process(input,number),is(result));
    }

    @Test
    public void shouldReturnOddValue() {
        List<Integer> result = Arrays.asList(1,3,5);
        Processer processer = new OddProcesser();
        assertThat(processer.process(input,number),is(result));
    }

    @Test
    public void shouldReturnEvenValue() {
        List<Integer> result = Arrays.asList(2,4);
        Processer processer = new EvenProcesser();
        assertThat(processer.process(input,number),is(result));
    }
}
