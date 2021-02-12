package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class SolutionRecursive {
    public List < Integer > inorderTraversal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        helper(root, solution);
        return solution;
    }

    private void helper(TreeNode root, List<Integer> solution) {
        if(root != null){
            if(root.left != null){
                helper(root.left, solution);
            }
            solution.add(root.val);
            if(root.right != null){
                helper(root.right, solution);
            }
        }
    }
}
