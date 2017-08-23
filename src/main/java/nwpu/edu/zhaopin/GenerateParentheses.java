package nwpu.edu.zhaopin;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chunk on 2017/8/21.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> list = new LinkedList<String>();
        generate(list,"",n,n);
        return list;
    }

    public void generate(LinkedList<String> list,String string, int left, int right){
        if (left == 0 && right ==0){
            list.add(string);
            return;
        }
        if (left > 0){
            generate(list,string+"(",left-1,right);
        }
        if (right>left && right>0){
            generate(list,string+")",left,right-1);
        }
    }
}
