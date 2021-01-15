package duplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class SolutionTwo {
    public List<Integer> findDuplicates(int[] nums) {


        List<Integer> theList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) theList.add(index + 1);
            nums[index] = -nums[index];

        }
        return theList;
    }
}