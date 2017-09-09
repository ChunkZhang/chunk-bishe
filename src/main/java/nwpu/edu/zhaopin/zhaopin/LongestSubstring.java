package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chunk on 2017/8/16.
 */
public class LongestSubstring {
    public static void main(String[] args){
        System.out.print(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
       List<Character> list = new ArrayList<Character>();
        int ans = 0;
        for (int i=0;i<chars.length;i++){
            if (!list.contains(chars[i])){
                list.add(chars[i]);
            }
            else {
                ans = Math.max(list.size(),ans);
                list = new ArrayList<Character>();
                list.add(chars[i]);
            }
            
        }
        return ans;
    }
}
