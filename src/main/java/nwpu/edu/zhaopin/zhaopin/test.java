package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/8/14.
 */
/**
 * Created by c81022908 on 2017/8/11.
 */
public class test {

    //0-1背包问题，背包的容量不超过maxVolume，求最多能装多少价值的东西
    int totalNum = 5;
    int maxVolume = 8;
    int[] weights = {6, 5, 2, 1, 1};
    int[] values = {48, 40, 12, 8, 7};
    int[] isSelects = new int[totalNum];

    public int backPack(int i, int remainVolume) {
        if (totalNum - 1 == i) {
            if (remainVolume >= weights[i]) {
                isSelects[i] = 1;
                return values[i];
            } else {
                return 0;
            }
        } else {
            if (remainVolume >= weights[i] && (backPack(i + 1, remainVolume - weights[i]) + values[i]) > backPack(i + 1, remainVolume)) {
                isSelects[i] = 1;
                return backPack(i + 1, remainVolume - weights[i]) + values[i];
            } else {
                isSelects[i] = 0;
                return backPack(i + 1, remainVolume);
            }
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test dp = new test();
        dp.backPack(0, dp.maxVolume);
        dp.printArray(dp.isSelects);
    }
}
