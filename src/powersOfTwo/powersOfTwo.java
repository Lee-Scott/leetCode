package powersOfTwo;

class Solution {
    public boolean isPowerOfTwo(int n) {
        int powOfTwo = 1;

        if(n == 0){
            return true;
        }

        while(powOfTwo < n){
            powOfTwo*=2;
        }

        return powOfTwo == n;

    }
}