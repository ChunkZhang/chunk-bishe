package nwpu.edu.zhaopin.jingdong.main1;

/**
 * Created by chunk on 2017/9/8.
 */
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        String s = in.nextLine();*/
        String s = "(((())))";
        int[] count = new int[1];
        digui(count,s);
        System.out.print(count[0]);
        int a =1;
    }

    public static void digui(int[] count,String s){
        if (!isValid(s)){
            return;
        }
        if (s.length()==0){
            count[0] = count[0]+1;
        }
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==')'){
                digui(count,s.substring(1,i)+s.substring(i+1,s.length()));
            }
        }
    }

    public static boolean isValid(String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count1++;
            }
            if (s.charAt(i)==')'){
                count2++;
            }
            if (count2>count1){
                return false;
            }
        }
        if (count1==count2){
            return true;
        }
        return false;
    }

}