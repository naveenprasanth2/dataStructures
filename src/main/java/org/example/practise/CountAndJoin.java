package org.example.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountAndJoin {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "a", "b", "c");
        String finalString = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(x -> "(" + x.getKey() + "," + x.getValue() + ")")
                .collect(collectToString());
        System.out.println(finalString);
    }

    private static Collector<CharSequence, ?, String> collectToString() {
        return Collectors.joining(",", "<", ">");
    }
}
