package nAryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class SolutionTwo {
   public List<Integer> postorder(Node root){
       List<Integer> solution = new ArrayList<>();
       if (root == null){
           return solution;
       }
       helper(root, solution);
       return solution;
   }

    private void helper(Node root, List<Integer> solution) {
       if (root.children != null){
           solution.add(root.val);
       }
       else {
           //helper(root.children) didn't realize until here that childern is a list not left and right...
       }
    }

}
