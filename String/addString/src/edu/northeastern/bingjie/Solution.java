package edu.northeastern.bingjie;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();

        int carry = 0;
        int l = num1.length() - 1;
        int r = num2.length() - 1;
        while (l >= 0 || r >= 0) {

            int x1 = l >= 0 ? num1.charAt(l) - '0' : 0;
            int x2 = r >= 0 ? num2.charAt(r) - '0' : 0;
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            ans.append(value);
            l--;
            r--;
        }

        if (carry != 0) ans.append(carry);

        return ans.reverse().toString();
    }
}