package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chunk on 2017/9/5.
 */
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lists = new ArrayList<List<String>>();
        diguiSolveNQueens(lists,n,0,new int[n]);
        return lists;
    }

    public void diguiSolveNQueens(List<List<String>> lists,int n,int row ,int[] nums){
        if (row == n){
            List<String> list = new ArrayList<String>();
            for (int i = 0;i<n;i++){
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0;j<n;j++){
                    if (nums[i] == j){
                        stringBuffer.append('Q');
                    } else {
                        stringBuffer.append('.');
                    }
                }
                list.add(stringBuffer.toString());
            }
            lists.add(list);
            return;
        }
        for (int i = 0;i<n;i++){
            nums[row] = i;
            if (check(row,nums)){
                diguiSolveNQueens(lists,n,row+1,nums);
            }
        }
    }

    private boolean check(int row, int[] nums){
        for (int i = 0;i<row;i++){
            if (nums[row]==nums[i] || Math.abs(nums[row]-nums[i])==row-i){
                return false;
            }
        }
        return true;
    }
}
