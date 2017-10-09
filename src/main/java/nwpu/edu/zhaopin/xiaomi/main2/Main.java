package nwpu.edu.zhaopin.xiaomi.main2;

import java.util.*;

/**
 * Created by chunk on 2017/9/18.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        Map<String, String> map = new HashMap<String, String>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.equals("-")) {
                if (count == 1) {
                    String[] strings = line.split(" ");
                    map.put(strings[1], strings[0] + "/");
                } else {
                    String string = line + "/";
                    boolean flag = false;
                    Set<String> keySet = map.keySet();
                    for (String key : keySet) {
                        String value = map.get(key);
                        if (value.equals(string)) {
                            System.out.println(key);
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        int length = Integer.MIN_VALUE;
                        String output = null;
                        for (String key : keySet) {
                            String value = map.get(key);
                            if (string.startsWith(value) && value.length() > length) {
                                length = value.length();
                                output = key;
                                flag = true;
                            }
                        }
                        if (flag == true) {
                            System.out.println(output);
                        }
                    }
                    if (flag == false) {
                        System.out.println(0);
                    }
                }
            } else {
                count = 2;
            }
        }
    }
}