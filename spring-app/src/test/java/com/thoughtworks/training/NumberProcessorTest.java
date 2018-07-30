package com.thoughtworks.training;

import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class NumberProcessorTest {


    @Test
    public void shouldCallProcesserAndReturnFinalValue() {
        Processer processer1 = mock(Processer.class);
        Processer processer2 = mock(Processer.class);

        when(processer1.process(ImmutableList.of(1,2,3,4,5),2)).thenReturn(ImmutableList.of(3,4,5,6,7));
        when(processer2.process(ImmutableList.of(3,4,5,6,7),2)).thenReturn(ImmutableList.of(4,6));

        NumberProcessor numberProcessor = new NumberProcessor(ImmutableList.of(processer1,processer2));
        InOrder inOrder = Mockito.inOrder(processer1,processer2);

        assertThat(numberProcessor.process("1 2 3 4 5",2),is("4 6"));

        verify(processer1,times(1)).process(ImmutableList.of(1,2,3,4,5),2);
        verify(processer2,times(1)).process(ImmutableList.of(3,4,5,6,7),2);


    }


}
