package nwpu.edu.didi;

import java.util.Scanner;

/**
 * Created by chunk on 2017/8/26.
 */
public class DiDiClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");

        int j = 0;
        int maxSofar = Integer.valueOf(split[j]);
        int sum = 0;
        while (j<split.length){
            sum = sum + Integer.valueOf(split[j]);
            if (sum<0){
                sum = 0;
            }else {
                maxSofar = Math.max(maxSofar,sum);
            }
            j++;
        }
        System.out.print(maxSofar);
    }
}
