package nwpu.edu.zhaopin.huawei;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/6.
 */
public class Main4 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        int outputNumber = scanner.nextInt();
        Integer[] w = new Integer[peopleNumber];
        for (int i = 0; i < w.length; i++) {
            w[i] = scanner.nextInt();
        }*/
        int peopleNumber = 5;
        int outputNumber = 3;
        Integer[] w = new Integer[]{4 ,4 ,1, 2,1};

        int time = 0;
        int sum = sumArr(w);
        int index = 0;
        int[] position = new int[peopleNumber];
        while (sum>0){

            for (int i=0;i<w.length;i++){
                if (w[i]==0){
                    position[i]=1;
                }
            }
            index = 0;
            for (int i = 0;i<outputNumber;i++){
                while (position[index]==1){
                    index++;
                }
                if (index>=peopleNumber) break;
                w[index] = w[index]-1;
                index++;
            }
            time++;
            sum = sumArr(w);
        }
        System.out.print(time);

    }

    public static int sumArr(Integer[] nums){
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]<0) nums[i]=0;
            sum = sum+nums[i];
        }
        return sum;
    }
}
