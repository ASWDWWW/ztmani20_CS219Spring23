package Exercises;

import Utility.MyArrays;

import java.util.Arrays;

public class Banish {

    public static void banish(int [] a, int [] b) {
        int i = 0;
        while (i < b.length) {
            int loc = MyArrays.indexOf(a,b[i]);
            if (loc != -1){
                MyArrays.shift(a, loc);
            }
            else {
                i++;
            }
        }


    } // end of banish2

    public static void main(String[] args) {
        int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};

        int[] a2 = {42, 2222, 9};

        banish(a1, a2);

        System.out.println(Arrays.toString(a1));

        int [] answer = {3, 0, 17, 8, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.equals(a1, answer));

    }
}
