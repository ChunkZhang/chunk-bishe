package nwpu.edu.zhaopin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by chunk on 2017/8/22.
 */
public class SubstringwithConcatenationofAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        Set<Integer> set = new HashSet<Integer>();
        getNeedle(set,s,words,"",new ArrayList<Integer>());
        return new ArrayList<Integer>(set);
    }

    public void getNeedle(Set<Integer> set,String s, String[] words, String needle, List<Integer> already){
        if (needle.length() == words.length*words[0].length()){
            int index = 0;
            String s1 = s;
            while (s1.contains(needle)){
                index = s1.indexOf(needle)+index;
                set.add(index);
                index = index + 1;
                s1 = s.substring(index,s.length());
            }
            return;
        }
        for (int i = 0; i<words.length ;i++){
            if (!already.contains(i)) {
                ArrayList<Integer> integers = new ArrayList<Integer>(already);
                integers.add(i);
                getNeedle(set, s, words, needle + words[i],integers);
            }
        }
    }
}
