package duplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> theList = new ArrayList<>();

        for(int x = 0; x < nums.length - 1; x++){
            for(int i = x+1; i < nums.length; i++){
                if(nums[x] == nums[i]){
                    theList.add(nums[x]);
                }

            }
        }
        return theList;
    }
}
