package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chunk on 2017/9/5.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> lists = new LinkedList<List<Integer>>();
        lists.add(new ArrayList<Integer>());
        for (int j = 0;j<nums.length;j++){
            while (lists.peek()!=null&& lists.peek().size()==j){
                List<Integer> remove = lists.remove();
                for (int i = 0;i<nums.length ;i++){
                    if (!remove.contains(nums[i])) {
                        List<Integer> newList = new ArrayList<Integer>(remove);
                        newList.add(nums[i]);
                        lists.add(newList);
                    }
                }
            }
        }
        return lists;
    }
}
