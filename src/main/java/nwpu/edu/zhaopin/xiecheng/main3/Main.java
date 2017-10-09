package nwpu.edu.zhaopin.xiecheng.main3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by chunk on 2017/9/21.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        System.out.print(sb.toString());
    }
}
