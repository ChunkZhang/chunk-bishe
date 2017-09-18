package nwpu.edu.zhaopin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int n  = Integer.valueOf(in.nextLine());
        String[] strings = in.nextLine().split(" ");
        int [] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = Integer.valueOf(strings[i]);
        }*/
        int n = 9;
        int[] nums = {51,23,52,97,97,52,76,23,51};
        int first = 0;
        int end = n-1;
        int sum = 0;
        while (first<=end){
            if (first==end){
                sum = sum+nums[first];
                break;
            }
            if (nums[first] == nums[end]){
                sum = sum + 2*nums[first];
                first++;
                end--;
                continue;
            }
            if (nums[first]>nums[end]){
                sum = sum + 2*nums[end];
                end--;
                continue;
            }
            if (nums[first]<nums[end]){
                sum = sum + 2*nums[first];
                first++;
                continue;
            }
        }
        System.out.print(sum);

    }
}