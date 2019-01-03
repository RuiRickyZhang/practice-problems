package Leetcode;

import java.util.ArrayList;

public class Longest_Sequence {
    public int findLengthOfLCIS(int[] nums) {
        int local = 1;
        int global = 1;
        int count = 0;
        int j = 1;

        if(nums.length < 1){
            global = 0;
            return global;
        }
        else {
            for (int i = 0; i < nums.length - 1; i++) {
                count = (nums[i+1] > nums[i])?1:-nums.length;

                local = Math.max(local + count, 1);
                global = Math.max(global, local);
            }
            return global;
        }
        }

    public static void main(String []args) {

        Longest_Sequence result = new Longest_Sequence();
        int[] input = {1,2,3,4,5};
        System.out.println(result.findLengthOfLCIS(input));

    }
    }

