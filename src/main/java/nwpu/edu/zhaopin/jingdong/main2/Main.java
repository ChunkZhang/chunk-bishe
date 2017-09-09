package nwpu.edu.zhaopin.jingdong.main2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n*n;
        int num = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                num = (int) Math.pow(i, j);
                num = num > n ? n : num;
                for (int k = 2; k <= num; k++) {
                    int left = 1;
                    int right = n;
                    int middle = 0;
                    while (left <= right) {
                        if (count > 1000000007) {
                            count %= 1000000007;
                        }
                        middle = (left + right) / 2;
                        if (Math.pow(i, j) == Math.pow(k, middle)) {
                            count++;
                            break;
                        } else if (Math.pow(i, j) > Math.pow(k, middle)) {
                            left = middle + 1;
                        } else {
                            right = middle - 1;
                        }
                    }
                }
            }
        }
        System.out.println(count % 1000000007);
    }
}