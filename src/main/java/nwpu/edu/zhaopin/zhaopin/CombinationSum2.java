package nwpu.edu.zhaopin.zhaopin;


import java.util.*;

/**
 * Created by chunk on 2017/9/4.
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> lists = new HashSet<List<Integer>>();
        Arrays.sort(candidates);
        diguiSum2(lists, new ArrayList<Integer>(), target, candidates, 0,0);
        int a = 1;
        return new ArrayList<List<Integer>>(lists);
    }

    public void diguiSum2(Set<List<Integer>> lists,List<Integer> list,int target,int[] candidates,int sum,int index){

        if (sum == target){
            lists.add(list);
            return;
        }

        for (int i = index;i<candidates.length;i++){
            if (sum+candidates[i]<=target) {
                List<Integer> newList = new ArrayList<Integer>(list);
                newList.add(candidates[i]);
                diguiSum2(lists, newList, target, candidates, sum + candidates[i],i+1);
            }
        }
    }
}
