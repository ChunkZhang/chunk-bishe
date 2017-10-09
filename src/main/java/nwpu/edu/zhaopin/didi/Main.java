package nwpu.edu.zhaopin.didi;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/23.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(method("95.123",12));
    }

    private static String method(String nums,int n) {
        String ans = "";
        if (nums.contains(".")){
            int indexOf = nums.indexOf(".");
            String trueNums = nums.substring(0,indexOf)+nums.substring(indexOf+1,nums.length());
            int xiaoshu = nums.length()-1-indexOf;
            ans = trueNums;
            for (int i = 0;i<n-1;i++){
                ans = arrayFormat(multi(ans,trueNums));
            }
            ans = ans.substring(0,ans.length()-xiaoshu*n)+"."+ans.substring(ans.length()-xiaoshu*n,ans.length());
        }else {
            ans = nums;
            for (int i = 0;i<n-1;i++){
                ans = arrayFormat(multi(ans,nums));
            }
        }
        return ans;
    }

    public static int [] multi(String str1, String str2) {
        char[] nums1 = new StringBuffer(str1).reverse().toString().toCharArray();
        char[] nums2 = new StringBuffer(str2).reverse().toString().toCharArray();
        int len = nums1.length+nums2.length;
        int [] array = new int[len];
        for(int i = 0 ; i < nums2.length ; i++){
            for(int j = 0 ; j < nums1.length ; j++){
                array[len-1-(i+j)] += (nums2[i]-48)*(nums1[j]-48);
            }
        }
        return array;
    }
    public static String arrayFormat(int [] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            array[i-1] += array[i]/10;
            array[i] = array[i]%10;
        }
        StringBuffer buffer = new StringBuffer();
        if(array[0]!=0){
            buffer.append(array[0]);
        }
        for(int i = 1 ; i < array.length ; i++){
            buffer.append(array[i]);
        }
        return buffer.toString();
    }

}
