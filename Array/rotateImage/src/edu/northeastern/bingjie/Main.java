package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};

        Solution sl = new Solution();
        sl.rotateImage(matrix1);
        sl.rotateImage(matrix2);

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length; j++){
                System.out.println(matrix1[i][j]);
            }
        }
        System.out.println("-------");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2.length; j++){
                System.out.println(matrix2[i][j]);
            }
        }
    }
}
