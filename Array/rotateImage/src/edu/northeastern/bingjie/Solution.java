package edu.northeastern.bingjie;

public class Solution {

    public void rotateImage(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < (len + 1) / 2; i ++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[len - 1 - j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - j - 1];
                matrix[len - 1 - i][len - j - 1] = matrix[j][len - 1 -i];
                matrix[j][len - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
