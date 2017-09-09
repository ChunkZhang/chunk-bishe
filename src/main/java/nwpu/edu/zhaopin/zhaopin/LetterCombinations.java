package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chunk on 2017/8/18.
 */
public class LetterCombinations {

    public static void main(String[] args){
        System.out.println(letterCombinations(" "));
    }


    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.length()==0) return list;
        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letter = "";
        digui(list,letters,digits,letter);
        int a = 1;
        return list;
    }
    public static void digui(List<String> list,String[] letters, String digits, String letter){
        if (digits==""){
            return ;
        }
        int num = Character.getNumericValue(digits.charAt(0));
        for (int i = 0; i<letters[num].length();i++){
            String newletter = letter+letters[num].charAt(i);
            if (digits.length()==1){
                list.add(newletter);
            }
            else {
                digui(list,letters,digits.substring(1,digits.length()),newletter);
            }
        }
    }

    public static List<String> letterCombinationsNew(String digits) {
        LinkedList<String> list = new LinkedList<String>();
        if (digits.length()==0){
            return list;
        }
        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");
        for (int i=0;i<digits.length();i++){
            int num = Character.getNumericValue(digits.charAt(i));
            while (list.peek().length()==i){
                String remove = list.remove();
                for (int j = 0; j<letters[num].length();j++){
                    list.add(remove+letters[num].charAt(j));
                }
            }
        }
        return list;
    }
}
