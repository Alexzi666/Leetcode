package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println(sl.isPalindrome(test1)); //true
        System.out.println(sl.isPalindrome(test2)); //false
    }
}
