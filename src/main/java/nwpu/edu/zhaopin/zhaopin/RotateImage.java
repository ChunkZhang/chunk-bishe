package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/9/5.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        for (int i = matrix.length-1;i>=0;i=i-1){
            for (int j = matrix.length-i-1;j<i;j++){
                int tep = matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = matrix[matrix.length-1-j][matrix.length-1-i];
                matrix[matrix.length-1-j][matrix.length-1-i] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = matrix[j][i];
                matrix[j][i] = tep;
            }
        }
        int a= 1;
    }
}
