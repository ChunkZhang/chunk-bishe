package nwpu.edu.zhaopin.zhongxing;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chunk on 2017/9/8.
 */
public class Test {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        set.add(null);
        int []x[] = new int[1][1];
        DayofWork d = new DayofWork();
        System.out.print(d.maximumNumberOfDaysToWork(3,new int[]{7,2,3}));
    }
}
