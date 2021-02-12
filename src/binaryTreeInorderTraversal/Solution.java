package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> solution = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return solution;
        }
        TreeNode current = root;

        while(current != null || !stack.isEmpty()){
            while(current !=null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            solution.add(current.val);
            current = current.right;

        }
        /*if(root.left != null){
            inorderTraversal(root.left);
        }
        else if(root.right != null){
            inorderTraversal(root.right);
        }
        else {
            solution.add(root.val);
        }
        */
        return solution;

    }
}




