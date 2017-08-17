package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/16.
 */
public class LongestCommonSubstring {
    public static void main(String[] args){
        System.out.println(longestCommonSubstring("aaba","abaa"));
    }
    public static String longestCommonSubstring(String s1, String s2){

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int count = 0;
        int indexi = 0;
        int indexj = 0;
        int[][] common = new int[chars1.length][chars2.length];
        for (int i = 0;i<chars1.length;i++){
            for (int j = 0;j<chars2.length;j++){
                if (chars1[i]==chars2[j]){
                    if (i==0 || j==0){
                        common[i][j] = 1;
                    }else {
                        common[i][j] = common[i-1][j-1]+1;
                    }
                    if (common[i][j]>count){
                        indexi = i;
                        indexj = j;
                        count = common[i][j];
                    }
                }
            }
        }
        if (count>0){
            String result = "";
            for (int i=count;i>0;i--){
                result = result+chars1[indexi-i+1];
            }
            return result;
        }
        return null;
    }
}
