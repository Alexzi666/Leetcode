package edu.northeastern.bingjie;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Solution sl = new Solution();

        int[][] test1 = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans1 = sl.spiralOrder(test1);

        int[][] test2 = {{1,2,3},{4,5,6}};
        List<Integer> ans2 = sl.spiralOrder(test2);

        for(int i = 0; i < ans1.size(); i++){
            System.out.println(ans1.get(i));
        }

        System.out.println("-------");
        for(int i = 0; i < ans2.size(); i++){
            System.out.println(ans2.get(i));
        }
    }
}
