package edu.northeastern.bingjie;

class Solution {
    public int[][] transpose(int[][] A) {
        int Row = A.length, Col = A[0].length;
        int[][] res = new int[Col][Row];
        for (int r = 0; r < Row; ++r)
            for (int c = 0; c < Col; ++c) {
                res[c][r] = A[r][c];
            }
        return res;
    }
}
