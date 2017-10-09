package nwpu.edu.zhaopin.xiecheng;

/**
 * Created by chunk on 2017/9/21.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc .nextLine().split(",");
        int target = Integer.valueOf(ss[0].split("=")[1]);
        for (int i = 1;i<ss.length;i++){
            COUNTS[i-1] = Integer.valueOf(ss[ss.length-i].split("=")[1]);
        }
        calculate(target, 0, 0);
        System.out.println(components.size());
    }

    private static final int[] UNITS =  {100, 50, 20, 10, 5, 1};
    private static final int[] COUNTS = new int[6];
    private static List<String> components = new LinkedList<String>();

    public static void calculate(int target, int currentSum, int index) {
        if (target == currentSum) {
            return;
        }

        if (index >= UNITS.length) {
            return;
        }

        for (int s = index; s < UNITS.length; ++s) {
            for (int i = 0; i <= (target - currentSum) / UNITS[s] && i<=COUNTS[s]; ++i) {
                if (currentSum + UNITS[s] * i <= target) {
                    if (i != 0) {
                        components.add(UNITS[s] + " * " + i);
                    }

                    calculate(target, currentSum + UNITS[s] * i, s+1);

                    if (i != 0) {
                        components.remove(components.size() - 1);
                    }
                }
            }
        }
    }
}