package nwpu.edu.zhaopin.zhaopin;

import java.util.List;

/**
 * Created by chunk on 2017/9/5.
 */
public class JumpGame2 {
    public int jump(int[] nums) {
//        return jump1(nums);
//        return jump2(nums);
        int reach = 0;
        int count = 0;
        int lastReach = 0;
        for (int i = 0;i<reach&&i<nums.length;i++){
            if (i>lastReach){
                count++;
                lastReach =reach;
            }
            reach = Math.max(reach,nums[i]+i);
        }
        if (reach<nums.length-1){
            return 0;
        }
        return count;
    }

    private int jump3(int[] A){
        if(A==null || A.length==0)
            return 0;
        int lastReach = 0;
        int reach = 0;
        int step = 0;
        for(int i=0;i<=reach&&i<A.length;i++)
        {
            if(i>lastReach)
            {
                step++;
                lastReach = reach;
            }
            reach = Math.max(reach,A[i]+i);
        }
        if(reach<A.length-1)
            return 0;
        return step;
    }

    private int jump2(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int[] count = new int[nums.length];
        for (int i = nums.length-2;i>=0;i--){
            count[i] = Integer.MAX_VALUE/2;
            if (nums[i]==0) continue;
            for (int j = i+1;j<nums.length&&j<=nums[i]+i;j++){
                count[i] = Math.min(count[i],count[j]+1);
            }
        }

        return count[0];
    }

    private int jump1(int[] nums) {
        int[] num = new int[]{Integer.MAX_VALUE};
        diguiJump(num,0,nums,0);
        return num[0];
    }

    public void diguiJump(int num[], int count ,int[] nums , int index){
        if (index>nums.length || count>num[0]){
            return;
        }
        if (index == nums.length-1){
            if (num[0]>count){
                num[0] = count;
            }
        }else if (index < nums.length){
            for (int i = index+1;i<=index+nums[index];i++){
                diguiJump(num,count+1,nums,i);
            }
        }
    }
}
