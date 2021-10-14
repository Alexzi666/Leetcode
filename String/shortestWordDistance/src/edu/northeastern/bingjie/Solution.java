package edu.northeastern.bingjie;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int minD = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(word2)) {
                        minD = Math.min(minD, Math.abs(i - j));
                    }
                }
            }
        }
        return minD;
    }
}