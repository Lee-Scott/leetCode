package palindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x){
        String s1 = Integer.toString(x);

        StringBuilder input1 = new StringBuilder();

        input1.append(s1);

        input1.reverse();
        String s2 = input1.toString();

        if(s2.equals(s1)){
            return true;
        }
        return false;

    }
    public static boolean isPalindromeTwo(int x){
        if(x < 0) return false;

        String str = String.valueOf(x);
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
