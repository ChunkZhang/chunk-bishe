package nwpu.edu.zhaopin.zhaopin;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by chunk on 2017/8/17.
 */
public class ThreeSum {

    public static void main(String[] args){

        int [] nums = {-1,0,1,2,-1,-4};
        threeSumNew(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> lists = new HashSet<List<Integer>>();

        List<Integer> fushu = new ArrayList<Integer>();
        List<Integer> zhengshu = new ArrayList<Integer>();
        int include0 = 0;

        for (Integer integer:nums){
            if (integer<0){
                fushu.add(integer);
            }else if(integer>0){
                zhengshu.add(integer);
            }else {
                include0++;
            }
        }

        for (int i = 0;i<zhengshu.size() ;i++){
            for (int j = i+1; j<zhengshu.size();j++){
                if (i!=j && fushu.contains(-(zhengshu.get(i)+zhengshu.get(j)))){
                    List<Integer> out = new ArrayList<Integer>();
                    out.add(-(zhengshu.get(i)+zhengshu.get(j)));
                    out.add(Math.min(zhengshu.get(i),zhengshu.get(j)));
                    out.add(Math.max(zhengshu.get(i),zhengshu.get(j)));
                    lists.add(out);
                }
            }
        }
        for (int i = 0;i<fushu.size() ;i++){
            for (int j = i+1; j<fushu.size();j++){
                if (i!=j && zhengshu.contains(-(fushu.get(i)+fushu.get(j)))){
                    List<Integer> out = new ArrayList<Integer>();
                    out.add(Math.min(fushu.get(i),fushu.get(j)));
                    out.add(Math.max(fushu.get(i),fushu.get(j)));
                    out.add(-(fushu.get(i)+fushu.get(j)));
                    lists.add(out);
                }
            }
        }
        if (include0>0){
            for (Integer integer:fushu){
                for (Integer integer1:zhengshu){
                    if (integer.equals(-integer1)){
                        List<Integer> out = new ArrayList<Integer>();
                        out.add(integer);
                        out.add(0);
                        out.add(integer1);
                        lists.add(out);
                    }
                }
            }
        }
        if (include0>2){
            List<Integer> out = new ArrayList<Integer>();
            out.add(0);
            out.add(0);
            out.add(0);
            lists.add(out);
        }
        return new ArrayList<List<Integer>>(lists);
    }

    public static List<List<Integer>> threeSumNew(int[] nums){
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-2; i++){
            if (i==0 || (i>0 && nums[i]!=nums[i-1])){
                int target = 0 - nums[i];
                int low = i+1;
                int high = nums.length-1;
                while (low < high){
                    if (nums[low]+nums[high] == target){
                        lists.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while (low<high && nums[low]==nums[low+1]) low++;
                        while (low<high && nums[high]==nums[high-1]) high--;
                        low++;
                    }else if (nums[low]+nums[high] < target){
                        low++;
                    }else {
                        high--;
                    }
                }
            }
        }
        return lists;
    }
}
