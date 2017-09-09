package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/9/6.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int maxNow = nums[0];
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
            maxNow = Math.max(maxNow,sum);
            if (sum<0){
                sum = 0;
            }
        }
        return maxNow;
    }
}
