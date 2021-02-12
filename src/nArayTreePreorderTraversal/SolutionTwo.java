package nArayTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

class SolutionTwo {
    public List<Integer> preorder(Node root) {
        List<Integer> solution = new ArrayList<>();
        if(root == null) return solution;
        solution.add(root.val);
        search(root, solution);
        return solution;
    }

    public void search(Node node, List<Integer> solution) {
        for(Node child : node.children) {
            solution.add(child.val);
            search(child, solution);
        }
    }
}