package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    /*
    Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

-reword question : given an array, return all variations of subsets BUT cannot be duplicated.

edge cases:
- if all the numbers in the array are the same, there will only be two outputs.
- if the array is empty, one output

-questions:
    - will the array always be numbers?
    - will the array ever have +/-?

- input : integer
- output: nested list

-data structure: arrays / arraylist

-pseudocode: if para nums==0 , return the para-arr
if
    -

     */
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> arr = new ArrayList<>();

        if (nums.length == 0 || nums == null) {
            return arr;
        }

        // does sorting make a difference here?
        Arrays.sort(nums);

        arr.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            int size = arr.size();
            for (int j = 0; j < size; j++) {
                List<Integer> subset = new ArrayList<>(arr.get(j));
                subset.add(nums[i]);
                if (!arr.contains(subset)) {
                    arr.add(subset);
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}
