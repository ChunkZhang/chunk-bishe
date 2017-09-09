package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/9/1.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }
            if (nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
