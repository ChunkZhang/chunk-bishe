package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/21.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if ( needle.length()==0){
            return 0;
        }
        if (haystack.length()==0 || needle.length()==0){
            return index;
        }
        for (int i = 0; i< haystack.length()-needle.length()+1;i++){
            boolean flag = true;
            for (int j = 0; j<needle.length();j++){
                if (needle.charAt(j) != haystack.charAt(i+j)){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                index = i;
                break;
            }
        }
        return index;
    }
}
