package DataStructures;

public class SubsetSum {

        // Returns true if there is a subset
        // of set[] with sum equal to given sum

        //Input:  set[] = {3, 34, 4, 12, 5, 2}, sum = 9
        //Output:  True  //There is a subset (4, 5) with sum 9.

        // 1.restate question
        /*
        question: we are given array of integers and a sum = integer (9).
        output: if there is a subset within the array of integers that the sum is equal to the given sum (9) in this case.

       - input/output type:
        input : non-negative integers.
        output : integers

        edge cases
        - if the array is empty = return false;
        - if the sum is > than the max number in the array, return false
        - if the sum == 0 ; return true
        -  if sum >0 and n ==0;

        -1: will the numbers in the array always be whole numbers? (double vs float?)
        -2: can the subset be > 2 numbers? For example, this example gives a subset of 4 and 5. Can it be 3,4,2?


        set [] = {3,4,5,2}
        sum = 9;



         */

    public static boolean doesSumExist(int [] set, int n, int sum){
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
      boolean subset[][] = new boolean[sum+1][n+1];

        // If sum is 0, then answer is true
        for (int i = 0; i <=n; i++){
          subset[0][i] = true;
      }

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        // Fill the subset table in botton
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j]
                            || subset[i - set[j - 1]][j - 1];
            }
        }

           /* // uncomment this code to print table
        for (int i = 0; i <= sum; i++)
        {
        for (int j = 0; j <= n; j++)
            System.out.println (subset[i][j]);
        } */

        return subset[sum][n];
    }

    public static void main(String[] args) {
        int[] set = {1,2,3,4,5};
        int sum = 6;
        int n = 5;

        if (doesSumExist(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
