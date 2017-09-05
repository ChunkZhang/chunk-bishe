package nwpu.edu.zhaopin;

import java.lang.reflect.Array;

/**
 * Created by chunk on 2017/9/4.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        if (max<0){
            return 1;
        }
        int[] newNums = new int[max+1];
        if (newNums.length==0){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0)
                newNums[nums[i]] = 1;
        }
        for (int j = 1; j < newNums.length; j++) {
            if (newNums[j] == 0) {
                return j;
            }
        }
        return newNums.length;
    }
}
