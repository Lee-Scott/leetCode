package reverseInteger;

public class SolutionTwo {
    public int reverse(int x){
        boolean isNeg = false;
        if(x == 0){
            return 0;
        }
        if(x < 0){
            isNeg = true;
        }
        int temp = 0, digit = 1, result = 0;
        while(x != 0){
            temp = x % 10;
            result =+ (temp * (10 * digit));
            digit ++;
            x/=10;

        }
        if(isNeg == true){
            result = result * -1;
        }
        return result;

    }
}
