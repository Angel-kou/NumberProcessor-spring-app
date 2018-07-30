package com.thoughtworks.training;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {

    List<Processer> processers;

    public NumberProcessor(List<Processer> processers) {
        this.processers = processers;
    }


    String process(String input , Integer number){

        List<Integer> temp = Arrays.asList(input.split(" ")).stream().map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();

        for (Processer p : processers){
             list = p.process(temp,number);
             temp = list;

        }
        List<String> res = list.stream().map(String::valueOf).collect(Collectors.toList());
                System.out.println(String.join(" ",res));

        return String.join(" ",res);

    }

}
