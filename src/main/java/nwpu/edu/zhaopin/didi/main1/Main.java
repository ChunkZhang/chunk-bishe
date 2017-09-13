package nwpu.edu.zhaopin.didi.main1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = in.nextInt();
        }*/


        int[] nums = new int[]{3,0,2,2,0,3,3,4,3};
        int n = nums.length;
        int count = 0;
        int index1=0;
        int index2=index1;
        int temp = nums[index1];
        while (index1<n && index2<n) {
            if (temp == 0){
                count++;
                index2++;
                index1 = index2;
                if (index1>=n){
                    break;
                }
                temp = nums[index1];
                continue;
            }
            index2++;
            if (index2>=n){
                break;
            }
            if (nums[index2]==0){
                count++;
                index2++;
                index1 = index2;
                if (index1>=n){
                    break;
                }
                temp = nums[index1];
                continue;
            }
            if (nums[index2]==nums[index2-1]){
                count++;
                index2++;
                index1 = index2;
                if (index1>=n){
                    break;
                }
                temp = nums[index1];
                continue;
            }
            temp = temp^nums[index2];
        }
        System.out.print(count);
    }
}