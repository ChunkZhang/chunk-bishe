package nwpu.edu.zhaopin.huawei;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        int outputNumber = scanner.nextInt();
        if (peopleNumber < 0 || outputNumber <= 0) {
            return;
        }
        Integer[] w = new Integer[peopleNumber];
        for (int i = 0; i < w.length; i++) {
            w[i] = scanner.nextInt();
        }
        Arrays.sort(w);
        int[] array = new int[outputNumber];
        for (int i = w.length - 1; i >= 0; i--) {
            array[findMinValueIndex(array)] += w[i];
        }
        System.out.println(findMax(array));

    }

    private static int findMax(int[] arrray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrray.length; i++) {
            if (arrray[i] > max) {
                max = arrray[i];
            }
        }
        return max;
    }

    private static int findMinValueIndex(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}