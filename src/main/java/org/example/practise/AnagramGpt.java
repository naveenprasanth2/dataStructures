package org.example.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramGpt {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
        // Output: [[eat, tea, ate], [tan, nat], [bat]]
    }

    private static List<List<String>> groupAnagrams(List<String> words) {
       return words.stream().collect(Collectors.groupingBy(AnagramGpt::sortedCharacters))
                .values()
                .stream()
                .toList();
    }

    private static String sortedCharacters(String text){
        char[] array = text.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
