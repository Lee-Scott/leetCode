package palindromeNumber;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void Test1(){
        Assert.assertEquals(true, Solution.isPalindrome(121));
        Assert.assertEquals(true, Solution.isPalindrome(123454321));
        Assert.assertEquals(false, Solution.isPalindrome(15645673));
        Assert.assertEquals(false, Solution.isPalindrome(-1));
    }

    @Test
    public void Test2(){
        Assert.assertEquals(true, Solution.isPalindromeTwo(121));
        Assert.assertEquals(true, Solution.isPalindromeTwo(123454321));
        Assert.assertEquals(false, Solution.isPalindromeTwo(15645673));
        Assert.assertEquals(false, Solution.isPalindromeTwo(-1));
    }
}
