package nwpu.edu.zhaopin.qunar;

import java.util.*;

/**
 * Created by chunk on 2017/9/20.
 */
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int m = in.nextInt();
            if (b==0){
                System.out.println(Math.pow(a,0) % m);
                return;
            }
            int res = 1;
            a %= m;
            for (; b != 0; b /= 2) {
                if (b % 2 == 1)
                    res = (res * a) % m;
                a = (a * a) % m;
            }
            System.out.println(res);
        }

    private static void bbb() {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int k = sc.nextInt();
        TreeSet<Character> setLow = new TreeSet<Character>();
        TreeSet<Character> setHigh = new TreeSet<Character>();
        for (int i = 0;i<strings.length;i++){
            setLow.add(strings[i].charAt(0));
            setHigh.add(strings[i].charAt(0));
        }
        List<Character> low = new ArrayList<Character>();
        List<Character> high = new ArrayList<Character>();
        for (int i = 0;i<k;i++){
            low.add(setLow.pollFirst());
            high.add(setHigh.pollLast());
        }
        for (int i = 0;i<low.size()-1;i++){
            System.out.print(low.get(i)+" ");
        }
        System.out.println(low.get(low.size()-1));
        for (int i = 0;i<high.size()-1;i++){
            System.out.print(high.get(i)+" ");
        }
        System.out.println(high.get(high.size()-1));
    }

    private static void aaa() {

    }
}
