package IsPalindromeInt;

class SolutionTwo {
    public boolean isPalindrome(int x)
    {
        if(x<0)
            return false;
        String s =String.valueOf(x);
        int len = s.length();
        for(int i=0 ,j=len-1 ; i<len/2 && j>=len/2 ;i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
