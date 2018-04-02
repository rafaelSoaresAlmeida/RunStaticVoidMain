package com.methods;

import java.util.HashMap;
import java.util.Map;

public class MaxSubstringWithoutRepeatedCharacters {

    public static int lengthOfLongestSubstring(String string) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < string.length(); j++) {
            if (map.containsKey(string.charAt(j))) {
                i = Math.max(map.get(string.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(string.charAt(j), j + 1);
        }
        return ans;
    }

}
