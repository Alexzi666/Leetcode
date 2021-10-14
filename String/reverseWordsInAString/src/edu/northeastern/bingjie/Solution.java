package edu.northeastern.bingjie;

import java.util.*;

public class Solution {

        public String reverseWords(String s) {
            int l = 0, r = s.length() - 1;

            while (l <= r && s.charAt(l) == ' ') ++l;


            while (l <= r && s.charAt(r) == ' ') --r;

            Deque<String> cur = new ArrayDeque();
            StringBuilder word = new StringBuilder();

            while (l <= r) {
                char c = s.charAt(l);

                if ((word.length() != 0) && (c == ' ')) {
                    cur.offerFirst(word.toString());
                    word.setLength(0);
                } else if (c != ' ') {
                    word.append(c);
                }
                l++;
            }
            cur.offerFirst(word.toString());

            return String.join(" ", cur);
        }

}
