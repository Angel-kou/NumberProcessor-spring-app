package com.thoughtworks.training;

import java.util.List;
import java.util.stream.Collectors;

public class AddProcessor implements Processer{

    @Override
    public List<Integer> process(List<Integer> input, int number) {
        return input.stream().map(item -> item + number).collect(Collectors.toList());
    }
}
