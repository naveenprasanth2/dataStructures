package org.example.practise;

import org.openqa.selenium.devtools.v85.webaudio.model.GraphObjectId;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagram1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
        // Output: [[eat, tea, ate], [tan, nat], [bat]]
    }

    private static List<List<String>> groupAnagrams(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(GroupAnagram1::find))
                .values()
                .stream()
                .toList();
    }

    private static String find(String word){
        char[] words = word.toCharArray();
        Arrays.sort(words);
        return new String(words);
    }
}
