package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();
        String s = "egg", t = "add";

        String ss = "foo", tt = "bar";

        System.out.println(sl.isIsomorphic(s,t));// should see: true
        System.out.println(sl.isIsomorphic(ss,tt));// should see: false
    }
}
