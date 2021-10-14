package edu.northeastern.bingjie;

public class Solution {
    public int compress(char[] chars) {
        int ct = 1, j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1 && chars[i] == chars[i + 1]) {
                ct++;
            } else {
                chars[j++] = chars[i];
                if (ct != 1) {
                    String cur = ct+ "";
                    for (int k = 0; k < cur.length(); k++) {
                        chars[j++] = cur.charAt(k);
                    }
                }
                ct = 1;
            }
        }
        return j;
    }

}
