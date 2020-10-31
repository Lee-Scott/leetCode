package relativeSortArray;

import java.util.ArrayList;

public class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        ArrayList<Integer> temp = new ArrayList<>();
        //test array

        for(int i = 0; i < arr2.length; i++){ // loop through arr2
            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    temp.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        ArrayList<Integer> asscendingEndSort = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != -1){
                for(int j = i; j < arr1.length; j++){
                    if(arr1[j] < arr1[i]){
                        if(arr1[j] != -1) {
                            asscendingEndSort.add(arr1[j]);
                            arr1[j] = -1;
                        }
                    }
                }
                asscendingEndSort.add(arr1[i]);
                arr1[i] = -1;
            }
        }
        temp.addAll(asscendingEndSort);

        int[] solution = new int[temp.size()];

        // Convert to int[]
        for(int i = 0; i < solution.length; i++){
            solution[i] = temp.get(i).intValue();
        }

        return solution;
    }
}
