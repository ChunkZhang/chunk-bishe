package nwpu.edu.zhaopin.zhaopin;

import java.util.Random;

/**
 * Created by chunk on 2017/9/14.
 */
public class ZeroOnePackage {
    public static void main(String[] args){
        /*int[] wights = new int[]{2,2,6,5,4};
        int[] values = new int[]{6,3,5,4,6};*/
        int totalNum = 0;
        int maxVolume = 23;
        int[] wights = null;
        int[] values = null;
        int[] isSelects = null;

        int n = 50;
            Random random = new Random();

            values = new int[n];
        wights = new int[n];
            for (int i = 0; i < wights.length; i++) {
                values[i] = random.nextInt(100);
                wights[i] = random.nextInt(10);
            }

        int total = 8;
        int[][] dp = new int[n+1][maxVolume+1];

        for (int i =1;i<maxVolume+1;i++){
            for (int j = 1;j<n+1;j++){
                if (i<wights[j-1]){
                    dp[j][i] = dp[j-1][i];
                }else {
                    dp[j][i] = Math.max(dp[j-1][i],dp[j-1][i-wights[j-1]]+values[j-1]);
                }
            }
        }
        int a = 1;
    }
}
