package com.Test.Java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers);
        numbers.forEach((n) -> System.out.println(n));
        numbers.forEach((n) -> {
            if (n % 2 == 0) {
                System.out.println("Even Numbers Are: " + n);
            }
        });

        List<Integer> n = Arrays.asList(4, 2, 6, 1, 5, 3);
        Stream<Integer> stream = n.stream();
        Stream<Integer> sortedStream = stream.sorted();
        System.out.println("Sorted Stream ");
        sortedStream.forEach(s ->{
            System.out.println(s);
        });
       // numbers.stream().sorted().forEach(s->System.out.println(s));
        System.out.println("Find Even Numbers Using Stream ");
        numbers.stream().sorted().filter(integer->integer%2==0).forEach(s ->System.out.println(s));
       numbers= numbers.stream().sorted().filter(num-> num%2==0).collect(Collectors.toList());
        System.out.println("Wapsi List: " +numbers );

        //Predicate<Integer> predicate = n-> n%2==0;

    }
}