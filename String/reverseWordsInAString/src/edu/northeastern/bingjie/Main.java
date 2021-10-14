package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        String s = "the sky is blue";
        String ss = "  hello world  ";

        System.out.println(sl.reverseWords(s)); // "blue is sky the"
        System.out.println(sl.reverseWords(ss)); // "world hello"
    }
}
