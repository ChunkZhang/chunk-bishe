package nwpu.edu.zhaopin.didi;

import java.util.Scanner;

/**
 * Created by chunk on 2017/8/26.
 */
public class DiDiClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String[] split = s.split(" ");
        for(int i = 0; i < split.length; i++){
            int count = 1;
            for(int j = 0; j < split.length; j++){
                if (Integer.valueOf(split[i])<Integer.valueOf(split[j])){
                    count++;
                }
            }
            if (count == k){
                System.out.print(split[i]);
                break;
            }
        }
    }
}
