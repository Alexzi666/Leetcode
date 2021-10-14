package edu.northeastern.bingjie;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int index = 0;
        for (int n: nums) {
            if (n != 0) nums[index++] = n;
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
