package nwpu.edu.zhaopin;

import java.util.LinkedList;

/**
 * Created by chunk on 2017/8/22.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int length = 0;
        for (int i = 0;i<s.length()-length;i++){
            if (s.charAt(i)=='('){
                LinkedList<Character> linkedList = new LinkedList<Character>();
                int count = 0;
                for (int j = i;j<s.length();j++){
                    if (s.charAt(j)=='('){
                        linkedList.add(')');
                    }
                    else {
                        count++;
                        if (linkedList.peek()!=null && !(s.charAt(j)==linkedList.remove())){
                            length = Math.max(length,count*2);
                        }
                    }
                }
            }
        }
        return length;
    }
}
