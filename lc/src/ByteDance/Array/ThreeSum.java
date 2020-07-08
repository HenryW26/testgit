package ByteDance.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int first = 0; first < n;++first){
            if(nums[first]>0){
                break;
            }
            if((first>0)&&nums[first]==nums[first-1]){
                continue;
            }
            int L = first+1;
            int R = n-1;
            while(L<R){
                int sum = nums[first]+nums[L]+nums[R];
                if(sum == 0){
                    res.add(Arrays.asList(nums[first],nums[L],nums[R]));
                    while(L<R&&nums[L]==nums[L+1]){
                        L++;
                    }
                    while(L<R&&nums[R]==nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }
                else if(sum<0){
                    L++;
                }
                else if(sum>0){
                    R--;
                }
            }
        }
        return res;
    }
}
