package nOfFib;

import javafx.beans.binding.MapExpression;

import java.util.Map;
import java.util.HashMap;
public class Solution {

    private static Map<Long, Long> memo = new HashMap<>();

    //recursive but slow
    public static long fib(long n){
        if (n <= 2) {
            return 1;
        }

        return fib(n-1) + fib(n-2);

    }
    //fib + memoization
    //memoization



    public static long fibMemo(long n){

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");

            // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        //System.out.printf("computing fib(%d)\n", n);
        long result = fibMemo(n - 1) + fibMemo(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }
    public static void main(String [] args){
        System.out.println("Fib of 6: " + fibMemo(6));
        System.out.println("Fib of 7: " + fibMemo(7));
        System.out.println("Fib of 50: " + fibMemo(50));  // to slow

    }
}
