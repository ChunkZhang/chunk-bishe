package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chunk on 2017/9/1.
 */
public class ATEST {
    public static void main(String[] args){
        MergeIntervals s = new MergeIntervals();
        List<Interval> list = new ArrayList<Interval>();
        list.add(new Interval(2,6));
        list.add(new Interval(1,3));

        list.add(new Interval(8,10));
        list.add(new Interval(15,18));
        s.merge(list);
    }
}
