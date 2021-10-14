package edu.northeastern.bingjie;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int ro = matrix.length, colm = matrix[0].length, u = 0, l = 0, r = colm - 1, d = ro - 1;

        while (ans.size() < ro * colm) {
            for (int col = l; col <= r; col++) {
                ans.add(matrix[u][col]);
            }
            for (int row = u + 1; row <= d; row++) {
                ans.add(matrix[row][r]);
            }
            if (u != d) {
                for (int col = r - 1; col >= l; col--) {
                    ans.add(matrix[d][col]);
                }
            }
            if (l != r) {
                for (int row = d - 1; row > u; row--) {
                    ans.add(matrix[row][l]);
                }
            }
            d--;
            l++;
            u++;
            r--;
        }

        return ans;
    }
}