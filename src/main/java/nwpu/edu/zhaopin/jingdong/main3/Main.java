package nwpu.edu.zhaopin.jingdong.main3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by chunk on 2017/9/8.
 */
public class Main {
    public static void main(String[] args){
        String s = "(((((())))))";
        int[] count = new int[1];
        digui(s,count);
        System.out.print(count[0]);
    }
    public static void digui(String s,int[] count){
        if (!isValid(s.toCharArray())){
            return;
        }
        if (s.length()==0){
            count[0]=count[0]+1;
            return;
        }
        for (int i = 1;i<s.length();i++){
            if (s.charAt(i)==')'){
                digui(s.substring(1,i)+s.substring(i+1,s.length()),count);
            }
        }
    }

    private static boolean isValid(char[] list) {
        Stack<Character> stack = new Stack<Character>();
        for (Character character : list) {
            if (stack.isEmpty()) {
                stack.push(character);
            } else if (stack.peek() == '(' && character == ')') {
                stack.pop();
            } else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
