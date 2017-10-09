package nwpu.edu.zhaopin.xiecheng.main2;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/21.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0;i<n;i++){
            A[i]  = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] B = new int[n];
        for (int i=0;i<m;i++){
            B[i]  = sc.nextInt();
        }
        int length = m + n;
        if (length % 2==0){
            System.out.print((find(A,B,length/2)+find(A,B,length/2+1))/2.0);
        }else {
            System.out.print(find(A,B,length/2+1));
        }

    }
    private static int find(int[] A,int[] B,int k){
        int p = 0;
        int q = 0;
        while (p+q<k-1){
            if (p>=A.length && q<B.length){
                q++;
                continue;
            }
            if (p<=A.length && q>B.length){
                p++;
                continue;
            }
            if (A[p]>B[q]){
                q++;
            }else {
                p++;
            }
        }
        if (p>=A.length){
            return B[q];
        }else if(q>=B.length){
            return  A[p];
        }else {
            return Math.min(A[p],B[q]);
        }
    }
}
