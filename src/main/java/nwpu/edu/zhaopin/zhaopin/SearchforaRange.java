package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chunk on 2017/9/1.
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length==0){
            return new int[]{-1,-1};
        }
        List<Integer> list = new ArrayList<Integer>();
        binarySearch(list,nums,0,nums.length-1,target);
        if (list.size()==0){
            return new int[]{-1,-1};
        }
        int min = list.get(0);
        int max = list.get(0);
        for (Integer integer:list){
            if (integer>max){
                max = integer;
            }
            if (integer<min){
                min = integer;
            }
        }


        return new int[]{min,max};
    }

    public void binarySearch(List<Integer> list,int[] nums,int begin,int end,int target){
        if (begin == end){
            if (nums[begin]==target){
                list.add(begin);
            }
            return;
        }
        binarySearch(list,nums,begin,(begin+end)/2,target);
        binarySearch(list,nums,(begin+end)/2+1,end,target);
    }
}
