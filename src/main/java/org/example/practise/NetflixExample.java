package org.example.practise;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NetflixExample {
    public static void main(String[] args) {
        String text = "Hello world! Hello everyone. Welcome to the world of Java. Java is fun. Fun is Java.";
        int N = 3;
        List<String> topNWords = findTopNFrequentWords(text, N);
        System.out.println(topNWords); // Output: [hello, java, is]
    }

    private static List<String> findTopNFrequentWords(String text, int n) {
        return Stream.of(text.toLowerCase()
                        .split(" "))
                .map(x -> x.replaceAll("[^a-zA-Z ]", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((x1, x2) -> ((int) (x2.getValue() - x1.getValue())))
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();
    }
}
