package org.example.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        long[] a = {1, 6, 5, 2, 3, 3, 2, 1};
        Map<Long, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (long value : a) {
            freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
        }

        freqMap.entrySet()
                .stream().filter(x -> x.getValue() > 1)
                .mapToInt(x -> x.getKey().intValue())
                .forEach(result::add);

        if (result.isEmpty()){
            result.add(-1);
        }

        System.out.println(result);
    }
}
