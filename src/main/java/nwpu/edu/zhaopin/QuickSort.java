package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/24.
 */
public class QuickSort {
    public static void main(String[] args){

        System.out.print(findUnlockKey(301));

    }
    public static long findUnlockKey(long lockingKey)
    {
        // WRITE YOUR CODE HERE
        String lockingString = String.valueOf(lockingKey);
        if(lockingKey<0){
            lockingString = String.valueOf(lockingKey).substring(1,lockingString.length());
        }
        int[] nums = new int[lockingString.length()];
        for (int i=0;i<lockingString.length() ;i++ ){
            int com = lockingString.charAt(i);
            int index = i;
            for(int j = i;j<lockingString.length();j++){
                if(lockingKey>0){
                    if(Integer.valueOf(lockingString.charAt(j)+"")<com){
                        com = Integer.valueOf(lockingString.charAt(j)+"");
                        index = j;
                    }
                }else{
                    if(Integer.valueOf(lockingString.charAt(j)+"")>com){
                        com = Integer.valueOf(lockingString.charAt(j)+"");
                        index = j;
                    }
                }
            }
            nums[i] = com;
        }
        String output = "";
        if (lockingKey>0){
            if (nums[0]==0){
                nums[0]=nums[1];
                nums[1]=0;
            }
            for(int i = 0;i<nums.length;i++){
                output = output+nums[i];
            }
        }else{
            output = output + "-";
            for(int i = 0;i<nums.length;i++){
                output = output+nums[i];
            }
        }
        return Long.valueOf(output);
    }
    public static int divide(int[] nums,int p, int q){
        int x = nums[p];
        int index = p;
        p++;
        while (p<=q){
            while (x < nums[q]){
                q--;
            }
            while (x > nums[p]){
                p++;
            }
            if (p<q){
                int exch = nums[q];
                nums[q] = nums[p];
                nums[p] = exch;
                q--;
                p++;
            }
            else {
                int exch = nums[q];
                nums[q] = x;
                nums[index] = exch;
                index = q;
            }
        }
        return q;
    }

    public static void quickSort(int[] nums,int p, int q){

        if (p<q){
            int r = divide(nums,p,q);
            quickSort(nums,p,r-1);
            quickSort(nums,r+1,q);
        }
    }
}
