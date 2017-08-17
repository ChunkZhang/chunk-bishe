package nwpu.edu.zhaopin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chunk on 2017/8/14.
 */
public class test
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while (scan.hasNext()){
            String s = scan.nextLine();
            list.add(s);
        }
        List<List<Integer>> listArr = new ArrayList<List<Integer>>();
        List<Integer> integers = new ArrayList<Integer>();
        listArr.add(integers);
        int index = 0;
        for (int i=0;i<list.size();i++){
            if (list.get(i).equals("0")){
                index++;
                List<Integer> integers1 = new ArrayList<Integer>();
                listArr.add(integers1);
            }
            listArr.get(index).add(Integer.valueOf(list.get(i)));
        }
        int sum =0;
        for (int i=0;i<listArr.size();i++){
            sum = sum+ maxCoins(listArr.get(i));
        }
        System.out.print(sum);
    }
    public static int maxCoins( List<Integer> list) {
        int[] nums = new int[list.size()];
        for (int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        int[] scores = new int[nums.length+2];
        scores[0] = 1;
        scores[scores.length-1] = 1;
        for(int i=0, j=1; i<nums.length; i++, j++) scores[j] = nums[i];

        int[][] coins = new int[scores.length][scores.length];
        for(int i=2; i<scores.length; i++) {
            for(int j=0; j+i<scores.length; j++) {
                for(int k=j+1; k<j+i; k++) {
                    coins[j][j+i] = Math.max(coins[j][j+i], coins[j][k] + coins[k][j+i] +
                            scores[j] * scores[k] * scores[j+i]);
                }
            }
        }
        return coins[0][scores.length-1];
    }
}
