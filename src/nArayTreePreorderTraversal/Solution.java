package nArayTreePreorderTraversal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root){

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> solution = new LinkedList<>();

        if(root == null){
            return solution;
        }
        stack.add(root);
       

        while(!stack.isEmpty()){
            Node node = stack.pollFirst();
            solution.add(node.val);
            //Collections.reverse(node.children);
            for(Node child : node.children){
                stack.add(child);
            }

        }

        return solution;
    }
}
