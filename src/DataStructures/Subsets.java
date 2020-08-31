package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    /*
    Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

the total number of subsets of any given set is equal to (2^ (no. of elemts in the set))
Therefore, what we have to do is just generate the binary numbers from 0 to 2^n – 1, where n is the length of the set or the numbers of elements in the set.
     */
    public static List<List<Integer>> subsets(int[] nums) {
        //this is where we would store the subsets
        List<List<Integer>> results = new ArrayList<>();

        //edge case - if the length is 0 or if the array is empty
        if (nums.length == 0 || nums==null){
            return results;
        }

        //sort the array
        Arrays.sort(nums);

        List<Integer> subset = new ArrayList<>();
        toFindAllSubsets(nums, results,subset,0);
        return results;
    }

    private static void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex){
        results.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++){
            subset.add(nums[i]);
            toFindAllSubsets(nums,results,subset, i+1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
