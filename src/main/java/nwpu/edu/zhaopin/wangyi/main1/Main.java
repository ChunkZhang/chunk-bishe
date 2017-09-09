package nwpu.edu.zhaopin.wangyi.main1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.valueOf(s);
        List<String[]> list = new ArrayList<String[]>();
        int count = 0;
        while (count<n){
            int m = Integer.valueOf(in.nextLine());
            String[] nums = in.nextLine().split(" ");
            list.add(nums);
            count++;
        }
        for (int j = 0;j<n;j++){
            String[] nums = list.get(j);
            int m = nums.length;
            int temp= 0;
            for (int i = 0;i<m;i++){
                if (Integer.valueOf(nums[i])%4==0){
                    temp++;
                }
            }
            if (temp>=m/2){
                System.out.println("Yes\n");
            }else {
                System.out.println("No");
            }
        }
    }
}