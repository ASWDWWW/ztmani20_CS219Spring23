package Exam2;

import java.util.Arrays;

public class Exam2 {
    public static Integer[] closest(Integer [] nums) {
        int [] is = new int[36];
        int [] js = new int[36];
        int k = -1;
        int target = Math.abs(nums[0] - nums[1]);
        int t;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (j != i){
                    t = Math.abs(nums[i] - nums[j]);
                    if (t < target) {
                        k++;
                        target = t;
                        is[k] = i;
                        js[k] = j;
                    }
                }
            }
        }
        return new Integer[]{is[k], js[k]};
    }

    public static void main(String[] args) {
        Integer [] nums = {4,0,-99,23,15,6};
        System.out.println(Arrays.toString(closest(nums)));
    }
}
