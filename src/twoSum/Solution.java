package twoSum;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[] {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    solution[0] = i;
                    solution[1] = y;
                    System.out.println("Solution " + solution.toString());
                    return solution;
                }
            }
        }
        return solution;
    }
}
