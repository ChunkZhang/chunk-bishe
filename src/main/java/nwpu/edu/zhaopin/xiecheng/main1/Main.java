package nwpu.edu.zhaopin.xiecheng.main1;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/21.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
            else if(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
            else i++;
        }
        i = 0;
        while(i < nums.length && nums[i] == i+1) i++;
        return i+1;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
