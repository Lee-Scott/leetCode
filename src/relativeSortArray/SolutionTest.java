package relativeSortArray;

import org.junit.Test;
import twoSum.Solution;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void Test1(){
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] solution = new int[]{2,2,2,1,4,3,3,9,6,7,19};
        assertArrayEquals(solution, relativeSortArray.Solution.relativeSortArray(arr1, arr2));

    }

    @Test
    public void Test2(){
        int[] nums = new int[]{ 3,2,4};
        int target = 6;
        int [] solution = new int[]{1, 2};

        //assertEquals(solution, twoSum.Solution.twoSum(nums, target));

        assertArrayEquals(solution, Solution.twoSum(nums, target));

    }
}
