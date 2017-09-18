package nwpu.edu.zhaopin.meituan.main2;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/14.
 */
public class Main {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] strings = scanner.nextLine().split(" ");
        int[] nums = new int[n];*/
        int n = 5;
        int[] nums = new int[]{1,1,1,0,0};
        /*for (int i = 0;i<n;i++){
            nums[i] = Integer.valueOf(strings[i]);
        }*/
        int count = 0;

            for (int i = 0;i<n;i++){
                if (nums[i]==1){
                    count++;
                    for (int j = i;j<n;j++){
                        nums[j] = 1-nums[j];
                    }
                }
            }

        if (count%2==1){
            System.out.print("Alice");
        }else {
            System.out.print("Bob");
        }
    }

    public static int countOne(int[] nums){
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum = sum +nums[i];
        }
        return sum;
    }

}
