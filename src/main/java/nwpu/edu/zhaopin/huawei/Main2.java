package nwpu.edu.zhaopin.huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        int m = in.nextInt();*/
        int m  = 99;
        if (m<=1 || m>=100){
            System.out.print("ERROR!");
        }
        List<Integer> circle = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            circle.add(i);
        }
        digui(circle,1,m);
        for (int i = 0;i<circle.size()-1;i++){
            System.out.print(circle.get(i)+",");
        }
        System.out.print(circle.get(circle.size()-1));
    }

    private static List<Integer> digui(List<Integer> circle, Integer index, Integer m) {
        if (circle.size() <m) {
            return circle;
        } else {
            for (int i = 0; i < circle.size(); i++) {
                if (index == m) {
                    circle.remove(i);
                    index = 0;
                    i--;
                }
                index++;
            }
            return digui(circle, index, m);
        }
    }
}
