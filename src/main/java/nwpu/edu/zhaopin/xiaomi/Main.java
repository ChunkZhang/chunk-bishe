package nwpu.edu.zhaopin.xiaomi;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/20.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long count = 0;
        for (int i = 1;i<n.length();i++){
            count = (long) (count + Math.pow(2,i));
            if (count>Math.pow(10,9)+7){
                count = (long) (count-Math.pow(10,9)+7);
            }
        }
        if(lessThan(printLuckNumber(count+1),n)){
            count++;
            while (lessThan(printLuckNumber(count),n)){
                count++;
            }
        }
        System.out.print(count);
    }

    private static String printLuckNumber(long m) {
        int k = (int) Math.ceil(Math.log((double) (m + 2)) / Math.log((double) 2));
        int index = (int) (m - (Math.pow(2, k - 1) - 1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            sb.append((index & 0x1) == 1 ? '7' : '4');
            index >>>= 1;
        }
        String result = sb.reverse().toString();
        return result;
    }

    private static boolean lessThan(String s1,String s2){
        if (s1.length()<s2.length()){
            return true;
        }else if (s1.length()>s2.length()){
            return false;
        }else {
            for (int i = 0;i<s1.length();i++){
                if (s1.charAt(i) == s2.charAt(i)){
                    continue;
                }else if (s1.charAt(i) < s2.charAt(i)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
