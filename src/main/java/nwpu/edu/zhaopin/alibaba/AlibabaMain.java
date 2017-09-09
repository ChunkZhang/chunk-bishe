/*
package nwpu.edu.alibaba;

import java.util.*;

*/
/**
 * Created by chunk on 2017/8/25.
 *//*

public class AlibabaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();

        // wirte your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result) {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        List<String> result = new ArrayList<String>();

        Map<String,List<UnilateralLine>> map = new HashMap<String, List<UnilateralLine>>();
        for (UnilateralLine unilateralLine:lineList){
            if (map.get(unilateralLine.getSCen()+"-"+unilateralLine.getECen())!=null){
                List<UnilateralLine> list = map.get(unilateralLine.getSCen()+"-"+unilateralLine.getECen());
                list.add(unilateralLine);
            }else {
                List<UnilateralLine> list = new ArrayList<UnilateralLine>();
                list.add(unilateralLine);
                map.put(unilateralLine.getSCen()+"-"+unilateralLine.getECen(),list);
            }
        }

        Set<Map.Entry<String, List<UnilateralLine>>> entrySet = map.entrySet();

        for(Map.Entry<String, List<UnilateralLine>> entry:map.entrySet()){
            List<UnilateralLine> listA = entry.getValue();
            if (listA!=null && listA.size()>0 && map.get(lineList.get(0).getECen()+"-"+lineList.get(0).getSCen())!=null){
                List<UnilateralLine> listB = map.get(lineList.get(0).getECen() + "-" + lineList.get(0).getSCen());
                for (int i = 0;i<listA.size();i++){
                    UnilateralLine unilateralLineA = listA.get(i);
                    for (int j = 0; j<listB.size() && j!=i;j++){
                        UnilateralLine unilateralLineB = listB.get(j);
                        if (unilateralLineA.getTType() == unilateralLineB.getTType()){
                            result.add("rule1:"+unilateralLineA.getId()+"+"+unilateralLineB.getId());
                            lineList.remove(unilateralLineA);
                            lineList.remove(unilateralLineB);
                            listA.remove(unilateralLineA);
                            listA.remove(unilateralLineB);
                        }
                    }
                }
            }
        }


        for (int i = 0; i<lineList.size();i++){
            UnilateralLine unilateralLineA = lineList.get(i);
            for (int j = 0;j<lineList.size();j++){
                UnilateralLine unilateralLineB = lineList.get(i);
                for (int k = 0; k<lineList.size();k++){
                    UnilateralLine unilateralLineC = lineList.get(i);
                    if ()
                }
            }
        }

        return result;
    }
}
*/
