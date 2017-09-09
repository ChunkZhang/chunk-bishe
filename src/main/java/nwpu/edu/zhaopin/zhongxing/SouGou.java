package nwpu.edu.zhaopin.zhongxing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Title: Main.java
 * @Package
 * @Description: TODO(用一句话描述该文件做什么)
 * @author CH
 * @date 2017年9月8日 下午4:28:40
 * @version V1.0
 */

/**
 * @ClassName: Main
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author CH
 * @date 2017年9月8日 下午4:28:59
 */
public class SouGou {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int pointNumber = Integer.parseInt(bufferedReader.readLine());
        double[] points = new double[pointNumber];
        for (int i = 0; i < points.length; i++) {
            points[i] = Double.parseDouble(bufferedReader.readLine()) % 360;
        }
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double temp = Math.abs(points[i] - points[j]);
                if (temp > 180) {
                    temp = 360 - temp;
                }
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.printf("%.8f", max);
        System.out.println();
    }
}