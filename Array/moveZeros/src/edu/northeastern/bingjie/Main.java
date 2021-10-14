package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        int[] test1 = {0,1,0,3,12};
        int[] test2 = {0,0,0,0,1};

        sl.moveZeroes(test1);
        sl.moveZeroes(test2);

        for(int i = 0; i < test1.length; i++){
            System.out.println(test1[i]);
        }
        System.out.println("~~~~~~~~~");
        for(int i = 0; i < test2.length; i++){
            System.out.println(test2[i]);
        }
    }
}
