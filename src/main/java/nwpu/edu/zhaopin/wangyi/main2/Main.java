package nwpu.edu.zhaopin.wangyi.main2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>();
        digui("",s,s.length(),integerIntegerHashMap);
        newFun(s);

        for (int i = s.length()-1;i>=1;i++){
            if (integerIntegerHashMap.get(i)!=null){
                System.out.print(integerIntegerHashMap.get(i));
                break;
            }
        }

    }

    private static void newFun(String s) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("");
        for (int i = 0; i<s.length();i++){
            while (strings.peek()!=null && strings.peek().length()==i){
                String s1 = strings.remove();
                strings.add(s1+"(");
                if (isValidSofar(s1+")")){
                    strings.add(s1+")");
                }
            }
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i< strings.size();i++){
            String s1 = strings.get(i);
            if (isValid(s1)){
                int maxSubstringLen = getMaxSubstringLen(s, s1);
                if (map.get(maxSubstringLen) != null) {
                    map.put(maxSubstringLen, map.get(maxSubstringLen) + 1);
                } else {
                    map.put(maxSubstringLen, 1);
                }
            }
        }
        for (int i = s.length()-1;i>=1;i++){
            if (map.get(i)!=null){
                System.out.print(map.get(i));
                break;
            }
        }
    }

    public static void digui(String s,String origin, int length, Map<Integer,Integer> map){
        if (!isValidSofar(s)){
            return;
        }
        if (s.length()==length){
            if (isValid(s)) {
                int maxSubstringLen = getMaxSubstringLen(s, origin);
                if (map.get(maxSubstringLen) != null) {
                    map.put(maxSubstringLen, map.get(maxSubstringLen) + 1);
                } else {
                    map.put(maxSubstringLen, 1);
                }
            }
            return;
        }
        digui(s+"(",origin,length,map);
        digui(s+")",origin,length,map);
    }
    public static int getMaxSubstringLen(String x, String y) {
        int xLen = x.length() + 1;
        int yLen = y.length() + 1;

        int rLen = xLen > yLen ? xLen : yLen;
        int cLen = xLen < yLen ? xLen : yLen;
        int[][] c = new int[rLen][cLen];
        for (int i = 1; i < rLen; i++) {
            for (int j = 1; j < cLen; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                } else {
                    c[i][j] = c[i][j - 1];
                }
            }
        }
        return c[xLen - 1][yLen - 1];
    }
    public static boolean isValid(String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count1++;
            }
            if (s.charAt(i)==')'){
                count2++;
            }
            if (count2>count1){
                return false;
            }
        }
        if (count1==count2){
            return true;
        }
        return false;
    }
    public static boolean isValidSofar(String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count1++;
            }
            if (s.charAt(i)==')'){
                count2++;
            }
            if (count2>count1){
                return false;
            }
        }
        if (count1>=count2){
            return true;
        }
        return false;
    }
}