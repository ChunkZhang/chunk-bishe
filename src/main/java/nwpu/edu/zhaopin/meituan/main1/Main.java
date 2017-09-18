package nwpu.edu.zhaopin.meituan.main1;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/14.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] strings = scanner.nextLine().split(" ");

        int count = 0;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n ;j++){
                if (i==j){
                    continue;
                }
                if (Long.valueOf(strings[i]+strings[j])%7==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
