package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/17.
 */
public class ContainerWithMostWater {
    public static void main(String[] args){

    }

    public static int containerWithMostWater(int[] height){

        int head = 0;
        int end = height.length-1;
        int area = 0;
        while (head<end){
            area = Math.max(area,Math.min(height[head],height[end])*(end-head));
            if (height[head]<height[end]){
                head++;
            }
            else {
                end--;
            }
        }

        return area;
    }
}
