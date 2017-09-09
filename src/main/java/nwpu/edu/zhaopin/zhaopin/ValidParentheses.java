package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/8/18.
 */
public class ValidParentheses {

    public static void main(String[] args){
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s) {
        if (s.length() % 2==1) return false;
        for (int i = 0; i<s.length();i=i+2){
            switch (s.charAt(i)){
                case '(':
                    if (s.charAt(i+1)!=')') return false;
                    break;
                case '[':
                    if (s.charAt(i+1)!=']') return false;
                    break;
                case '{':
                    if (s.charAt(i+1)!='}') return false;
                    break;
                    default:
                        return false;
            }
        }
        return true;
    }
}
