package nwpu.edu.zhaopin.zhaopin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chunk on 2017/9/13.
 */
public class QuickSort2 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        int[] nums = new int[]{3,3,567,1,2,4,7,3,312,354};
        quick(nums,0,nums.length-1);
        int a = 1;
    }
    private static void quick(int[] nums,int p, int q){
        if (p>=q){
            return;
        }
        int index = devide(nums,p,q);
        quick(nums,p,index-1);
        quick(nums,index+1,q);
    }
    private static int devide(int[] nums, int p,int q){
        int tem = nums[p];
        while (p<q){
            while (p<q && nums[q]>=tem){
                q--;
            }
            nums[p] = nums[q];
            while (p<q && nums[p]<=tem){
                p++;
            }
            nums[q] = nums[p];
        }
        nums[q]= tem;
        return q;
    }
}
