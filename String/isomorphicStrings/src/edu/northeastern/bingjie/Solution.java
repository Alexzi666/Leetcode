package edu.northeastern.bingjie;

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> myMap = new HashMap<>();
        Set<Character> val = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (myMap.containsKey(s.charAt(i)) && myMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (!myMap.containsKey(s.charAt(i)) && val.contains(t.charAt(i))) {
                return false;
            }
            myMap.put(s.charAt(i), t.charAt(i));
            val.add(t.charAt(i));
        }
        return true;
    }
}