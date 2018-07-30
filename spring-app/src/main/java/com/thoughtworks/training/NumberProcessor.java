package com.thoughtworks.training;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberProcessor {

    String process(String input){

        //        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.valueOf(s);
//            }
//        });

        List<String> number = Arrays.asList(input.split(" ")).stream().map(Integer::valueOf)
                .filter(integer -> integer % 2 != 0)
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.toList());
//        System.out.println(String.join(" ",number));
        return String.join(" ",number);

    }

    public static void main(String[] args) {
        new NumberProcessor().process(new Scanner(System.in).nextLine());

    }


    private class Mapper implements Function<String, Integer> {
        @Override
        public Integer apply(String s) {
            return Integer.valueOf(s);
        }
    }
}
