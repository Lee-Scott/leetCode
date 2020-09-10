package twoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void Test1(){
        int[] nums = new int[]{ 2,7,11,15};
        int target = 9;
        int [] solution = new int[]{0, 1};


        //assertEquals(solution, twoSum.Solution.twoSum(nums, target));

        assertArrayEquals(solution, twoSum.Solution.twoSum(nums, target));

    }

    @Test
    public void Test2(){
        int[] nums = new int[]{ 3,2,4};
        int target = 6;
        int [] solution = new int[]{1, 2};

        //assertEquals(solution, twoSum.Solution.twoSum(nums, target));

        assertArrayEquals(solution, twoSum.Solution.twoSum(nums, target));

    }
}
