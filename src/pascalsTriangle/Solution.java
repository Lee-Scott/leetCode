package pascalsTriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows){

        List<List<Integer>> solutionList = new ArrayList<>();

        if(numRows == 0){
            return solutionList;
        }

        List<Integer> rowOne = new ArrayList<Integer>();
        rowOne.add(1);
        solutionList.add(rowOne);

        for(int x = 1; x < numRows; x ++){
            List<Integer> lastRow = solutionList.get(x - 1);
            List<Integer> currentRow = new ArrayList<Integer>();

            currentRow.add(1);

            for(int y = 1; y < x; y++){
                currentRow.add(lastRow.get(y-1) + lastRow.get(y));
            }
            currentRow.add(1);
            solutionList.add(currentRow);

        }
        return (List<List<Integer>>) solutionList;
    }
}
