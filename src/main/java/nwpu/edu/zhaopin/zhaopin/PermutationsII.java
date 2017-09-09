package nwpu.edu.zhaopin.zhaopin;

import java.util.*;

/**
 * Created by chunk on 2017/9/5.
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<List<Integer>> lists = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        lists.add(new ArrayList<Integer>());
        for (int j = 0;j<nums.length;j++){
            while (lists.peek()!=null&& lists.peek().size()==j){
                List<Integer> remove = lists.remove();
                for (int i = 0;i<nums.length ;i++){
/*                    if (i>0 && nums[i]==nums[i-1]){
                        continue;
                    }*/
                    if (!remove.contains(i)) {
                        List<Integer> newList = new ArrayList<Integer>(remove);
                        newList.add(i);
                        lists.add(newList);
                    }
                }
            }
        }
        Set<List<Integer>> relist = new HashSet<List<Integer>>();
        for (int i = 0;i<lists.size();i++){
            List<Integer> integers = new ArrayList<Integer>();
            List<Integer> old = lists.get(i);
            for (int j = 0;j<old.size();j++){
                integers.add(nums[old.get(j)]);
            }
            relist.add(integers);
        }
        return new ArrayList<List<Integer>>(relist);
    }
}
