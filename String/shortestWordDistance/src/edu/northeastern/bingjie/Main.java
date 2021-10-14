package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        String[] wordD = {"practice", "makes", "perfect", "coding", "makes"};
        String str1 = "coding";
        String str2 = "practice";

        String[] wordD1 = {"practice", "makes", "perfect", "coding", "makes"};
        String str3 = "makes";
        String str4 = "coding";

        Solution sl = new Solution();
        System.out.println(sl.shortestDistance(wordD,str1,str2));
        System.out.println(sl.shortestDistance(wordD1,str3,str4));
    }
}
