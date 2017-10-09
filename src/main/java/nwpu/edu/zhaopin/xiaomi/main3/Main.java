package nwpu.edu.zhaopin.xiaomi.main3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chunk on 2017/9/18.
 */
public class Main {
    public static String cankao = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            List<String> list = new ArrayList<String>();
            digui(list,s,"");
            for (int i = 0;i<list.size()-1;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(list.size()-1));
        }
    }

    public static void digui(List<String> list,String num,String word){
        if (num.length()==0){
            list.add(word);
            return;
        }
        digui(list,num.substring(1,num.length()),word+cankao.charAt(Integer.valueOf(num.charAt(0)+"")-1));
        if (num.length()>=2 && Integer.valueOf(num.substring(0,2))<27){
            digui(list,num.substring(2,num.length()),word+cankao.charAt(Integer.valueOf(num.substring(0,2))-1));
        }
    }
}
