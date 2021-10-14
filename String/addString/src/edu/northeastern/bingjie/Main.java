package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();
        String num1 = "11", num2 = "123";

        String num11 = "456", num22 = "77";

        System.out.println(sl.addStrings(num1,num2)); //expect to see: 134
        System.out.println(sl.addStrings(num11,num22)); //expect to see: 533
    }
}
