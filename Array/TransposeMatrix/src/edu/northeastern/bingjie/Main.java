package edu.northeastern.bingjie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        Solution sl = new Solution();
        int[][] ans1 = sl.transpose(matrix1);
        int[][] ans2 = sl.transpose(matrix2);
        for(int i = 0; i < ans1.length; i++){
            for(int j = 0; j < ans1[0].length; j++){
                System.out.println(ans1[i][j]);
            }
        }
        System.out.println("_______");
        for(int i = 0; i < ans2.length; i++){
            for(int j = 0; j < ans2[0].length; j++){
                System.out.println(ans2[i][j]);
            }
        }
    }
}
