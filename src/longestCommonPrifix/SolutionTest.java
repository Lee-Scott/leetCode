package longestCommonPrifix;

import longestCommonPrifix.Solution;
import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void Test1() {
        String arr[] = {"flower", "flow",
                "flight"};

        int n = arr.length;

        Assert.assertEquals("fl", Solution.commonPrefix(arr));

    }

}