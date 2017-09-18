package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/9/13.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int index = 0;
        int reach = 0;
        while (index<nums.length){
            if (reach<index){
                return false;
            }
            reach = Math.max(reach,index+nums[index]);
            index++;
        }
        return reach>=nums.length-1;
    }
}
