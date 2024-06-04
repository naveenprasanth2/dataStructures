package org.example.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFrequency {
    public static void main(String[] args) {
        long[] a = {1, 6, 5, 2, 3, 3, 2};
        List<Long> test = Arrays.stream(a).boxed().toList();
        test.stream().filter(x -> Collections.frequency(test, x) > 1).distinct().forEach(System.out::println);
    }
}
