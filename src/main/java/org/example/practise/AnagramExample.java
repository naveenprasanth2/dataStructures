package org.example.practise;

import java.util.*;

public class AnagramExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
        // Output: [[eat, tea, ate], [tan, nat], [bat]]
    }

    private static List<List<String>> groupAnagrams(List<String> words) {
        HashSet<List<String>> tempSet = new HashSet<>();
        for (int i = 0; i < words.size(); i++){
            List<String> tempList = new ArrayList<>();
            tempList.add(words.get(i));
            List<String> iList = Arrays.stream(words.get(i).split("")).sorted().toList();
            for (int j = i + 1; j < words.size(); j++){
                List<String> jList = Arrays.stream(words.get(j).split("")).sorted().toList();
                if (iList.equals(jList)){
                    tempList.add(words.remove(j));
                }
            }
            Collections.sort(tempList);
            tempSet.add(tempList);
        }
      return tempSet.stream().toList();
    }
}
