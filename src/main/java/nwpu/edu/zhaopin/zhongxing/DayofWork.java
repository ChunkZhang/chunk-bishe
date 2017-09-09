package nwpu.edu.zhaopin.zhongxing;

import java.util.Arrays;

/**
 * Created by chunk on 2017/9/8.
 */
public class DayofWork {
    public int maximumNumberOfDaysToWork(int num, int[] countTown){
        Arrays.sort(countTown);
        int count = 0;
        int index = 0;
        if (countTown.length==0||countTown.length==1){
            return num;
        }
        while (getNoZeroCount(countTown)>1){
            for (int i = num-1;i>0;i--){
                if (countTown[i]>=countTown[i-1] && countTown[i]>0 && index != i){
                    countTown[i] = countTown[i]-1;
                    index = i;
                    count++;
                    break;
                }
                if (countTown[i]==countTown[i-1] && countTown[i-1]>0 && index != i-1){
                    countTown[i-1] = countTown[i-1]-1;
                    index = i-1;
                    count++;
                    break;
                }
            }
            if (countTown[0]>=countTown[num-1] && countTown[0]>0 && index !=0){
                countTown[0] = countTown[0]-1;
                index = 0;
                count++;
            }
        }
        if (getNoZeroCount(countTown)==1){
            for(int i = 0;i<num;i++){
                if (countTown[i]!=0){
                    if (index!=i){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public int getNoZeroCount(int[] countTown){
        int count = 0;
        for(int i = 0;i<countTown.length;i++){
            if (countTown[i]!=0){
                count++;
            }
        }
        return count;
    }
}
