package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class OddProcesser implements Processer{

    @Override
    public List<Integer> process(List<Integer> input, int number) {
        return input.stream().filter(item->item % 2 != 0).collect(Collectors.toList());
    }
}
