package edu.northeastern.bingjie;

public class Main {

    public static void main(String[] args) {
        Solution sl = new Solution();

        int[] test1 = {0,1,0,3,12};
        int[] test2 = {0,0,0,0,1};

        sl.moveZeroes(test1);
        sl.moveZeroes(test2);

        for(int i = 0; i < test1.length; i++){
            System.out.print(test1[i]);
        }
        // expect to see: 131200

        System.out.println("~~~~~~~~~");

        for(int i = 0; i < test2.length; i++){
            System.out.print(test2[i]);
        }
        //expect to see: 10000
    }
}
