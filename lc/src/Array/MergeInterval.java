package Array;

import java.util.Arrays;

public class MergeInterval {
    public int[][] merge(int[][] intervals){
        int[][] res = new int[intervals.length][2];
        Arrays.sort(intervals,(v1,v2)->(v1[0]-v2[0]));
        int idx = -1;
        for(int[] row:intervals){
            if(idx==-1||row[0]>res[idx][1]){
                res[++idx]=row;
            }
            else{
                res[idx][1]=Math.max(res[idx][1],row[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);
    }
}
