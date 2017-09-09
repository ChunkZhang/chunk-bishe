package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/9/4.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;
        int head = 0;
        int end = height.length-1;
        int i = head+1;
        int j = end-1;
        while (head<end){
            if (height[head]>height[i]){
                i++;
            }else {
                for (int ii = head+1;ii<i;ii++){
                    if (height[head]-height[ii]>0)
                        sum = sum + height[head]-height[ii];
                }
                head = i;
                i++;
            }
            if (head>=end){
                break;
            }
            if (height[end]>height[j]){
                j--;
            }else {
                for (int ii = end-1;ii>j;ii--){
                    if (height[end]-height[ii]>0)
                        sum = sum + height[end]-height[ii];
                }
                end = j;
                j--;
            }
        }
        return sum;
    }
}
