package org.example.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectorExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");
        String result = strings.stream().map(x -> "(" + x + ")").collect(joiningWithComma());
        System.out.println(result); // Output: Apple,Banana,Cherry
    }

    private static Collector<CharSequence, ?, String> joiningWithComma() {
        return Collectors.joining(",", "<", ">");
    }


}
