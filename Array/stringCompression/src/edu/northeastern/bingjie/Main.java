package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        char[] test1 = {'a','a','c','c'};
        char[] test2 = {'c','c','a'};

        System.out.println(sl.compress(test1)); //4
        System.out.println(sl.compress(test2)); //3

    }
}
