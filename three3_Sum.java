package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three3_Sum {
    public static List<List<Integer>> three_Sum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);// Complexity: NlogN,then we can just sort once in the two sum
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            //ArrayList<Integer> temp = new ArrayList<Integer>();
            two_Sum(nums, -nums[i],i+1, nums.length-1,ans);

        }

        return ans;
    }

    public static void two_Sum(int[] nums, int target, int left, int right, List<List<Integer>> all){

        while(left < right){
            if(nums[left] + nums[right] == target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(-target);
                ans.add(nums[left]);
                ans.add(nums[right]);
                all.add(ans);

                left++;
                right--;

                while(left < right && nums[left] == nums[left+1]){
                    left++;
                }
                while(right > left && nums[right - 1] == nums[right]){
                    right--;
                }//The two steps are meant to avoid the duplicated numbers
            }

            else if(nums[left] + nums[right] < target){
                left++;
            }

            else{
                right--;
            }
        }
    }

    public static void main(String arg[]){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = three_Sum(nums);
        System.out.println(ans);
    }
}
