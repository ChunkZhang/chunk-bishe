package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/16.
 */
public class BurstBalloons {
    public static void main(String[] args){
        int[] nums = {2,3,4};
        System.out.print(getMaxCoins(nums));
    }

    public static int getMaxCoins(int[] nums){
        int[] newNums = new int[nums.length+2];
        for (int i=0;i<nums.length;i++){
            newNums[i+1]=nums[i];
        }
        newNums[0]=1;
        newNums[newNums.length-1]=1;
        int[][] dp = new int[newNums.length][newNums.length];

        for (int i=2;i<newNums.length;i++){
            for (int j=0;j+i<newNums.length;j++){
                for (int k=j+1;k<i+j;k++){
                    dp[j][j+i] = Math.max(dp[j][j+i],dp[j][k]+dp[k][j+i]+newNums[j]*newNums[k]*newNums[j+i]);
                }
            }
        }

        return dp[0][newNums.length-1];
    }
}
