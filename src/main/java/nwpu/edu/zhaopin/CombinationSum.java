package nwpu.edu.zhaopin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chunk on 2017/9/4.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        diguiSum(lists, new ArrayList<Integer>(), target, candidates, 0,0);
        int a = 1;
        return lists;
    }

    public void diguiSum(List<List<Integer>> lists,List<Integer> list,int target,int[] candidates,int sum,int index){

        if (sum == target){
            lists.add(list);
            return;
        }

        for (int i = index;i<candidates.length;i++){
            if (sum+candidates[i]<=target) {
                List<Integer> newList = new ArrayList<Integer>(list);
                newList.add(candidates[i]);
                diguiSum(lists, newList, target, candidates, sum + candidates[i],i);
            }
        }
    }
}
