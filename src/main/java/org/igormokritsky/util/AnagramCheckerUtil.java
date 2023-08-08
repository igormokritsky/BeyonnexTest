package org.igormokritsky.util;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckerUtil {

    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create character frequency maps for both texts
        Map<Character, Integer> frequencyMap1 = createFrequencyMap(text1);
        Map<Character, Integer> frequencyMap2 = createFrequencyMap(text2);

        // Compare the frequency maps
        return frequencyMap1.equals(frequencyMap2);
    }

    private static Map<Character, Integer> createFrequencyMap(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

}
