package nwpu.edu.zhaopin.huawei;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String s = in.nextLine();*/
        String s = "11111aa12341";
        char[] chars = s.toCharArray();
        int index = 0;
        int count = 0;
        int countSofar = 0;
        int maxSofar = 0;
        for (int i = 0;i<chars.length;i++){

            if (chars[i]>='0' && chars[i]<='9'){
                count++;
                if (count>=maxSofar){
                    maxSofar = count;
                    index = i-count+1;
                    countSofar = count;
                }
            }else {
                count = 0;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = index;i<index+countSofar;i++){
            stringBuffer.append(chars[i]);
        }
        if (maxSofar==0){
            System.out.print("");
        }else {
            System.out.print(stringBuffer.toString() + "\n");
            System.out.print(maxSofar);
        }
    }
}