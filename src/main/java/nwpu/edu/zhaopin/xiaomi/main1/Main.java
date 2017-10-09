package nwpu.edu.zhaopin.xiaomi.main1;

import java.util.Scanner;

/**
 * Created by chunk on 2017/9/18.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String guard = sc.nextLine();
            System.out.println(transfrom(guard));
        }
    }
    public static String transfrom(String string){
        StringBuilder result = new StringBuilder();
        result.append("_");
//        result.append(string.substring(0,1).toUpperCase());
        for (int i = 0; i < string.length()-1; i++) {
            String s = string.substring(i, i+1);
            if (s.equals(".")){
                result.append("_");
                continue;
            }
            String s1 = string.substring(i+1, i+2);
            if (s.equals(s.toUpperCase())) {
                if (!s1.equals(".")&&s1.equals(s1.toLowerCase())) {
                    if (i>0){
                        String s2 = string.substring(i-1, i);
                        if (!s2.equals(".")){
                            result.append("_");
                        }
                    }
                }
            }
            result.append(s.toUpperCase());
        }
        String substring = string.substring(string.length() - 1, string.length());
        String substring1 = string.substring(string.length() - 2, string.length()-1);
        if (substring.equals(substring.toUpperCase()) && substring1.equals(substring1.toLowerCase())){
            result.append("_");
        }
        result.append(substring.toUpperCase());
        result.append("_");
        return result.toString();
    }
}
