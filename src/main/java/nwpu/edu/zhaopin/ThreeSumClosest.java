package nwpu.edu.zhaopin;

import java.util.Arrays;

/**
 * Created by chunk on 2017/8/17.
 */
public class ThreeSumClosest {
    public static void main(String[] args){

    }

    public static int threeSumClosest(int[] nums, int target) {
        int real = 0;
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for (int i =0 ;i<nums.length-2;i++){
            if (i == 0 || (i>0 && nums[i]!=nums[i-1])){
                int low = i+1;
                int high = nums.length-1;

                while (low<high){
                    int sum  = nums[i]+nums[low]+nums[high];
                    if (sum < target){
                        if (target-sum < closest){
                            closest = target-sum;
                            real = sum;
                        }
                        low++;
                    }else if (sum > target){
                        if (sum - target < closest){
                            closest = sum-target;
                            real = sum;
                        }
                        high--;
                    }else {
                        return sum;
                    }
                }
            }
        }
        return real;
    }
}
