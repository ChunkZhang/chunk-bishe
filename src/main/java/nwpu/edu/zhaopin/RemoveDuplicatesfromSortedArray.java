package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/21.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i<nums.length; i++){
            if (nums[i-1]==nums[i]){
            }else {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
