package nwpu.edu.zhaopin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine()   );
        String[] strings = in.nextLine().split(" ");
        int q = Integer.valueOf(in.nextLine());
        int[] nums = new int[strings.length];
        Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0;i<strings.length;i++){
            int temp =  Integer.valueOf(strings[i]);
            if (map.get(temp)!=null){
                map.get(temp).add(i);
            }else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(temp,list);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0;i<q;i++){
            String[] ss = in.nextLine().split(" ");
            int target = Integer.valueOf(ss[2]);
            int low = Integer.valueOf(ss[0])-1;
            int high = Integer.valueOf(ss[1]);
            int count = 0;
            List<Integer> tempList = map.get(target);
            if (tempList==null){
                list.add(count);
                continue;
            }
            for (int j=0;j<tempList.size();j++){
                if(tempList.get(j)>high){
                    break;
                }
                if (tempList.get(j)>=low && tempList.get(j)<high){
                    count++;
                }
            }
            list.add(count);
        }
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}