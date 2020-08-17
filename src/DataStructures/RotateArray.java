package DataStructures;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        //we use an extra array in which we place every element of the array at its correct position. the number at index i in the original array is placed at index (i + k) length of the array. Then we copy the original one.
        int [] newArray = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            newArray[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            nums[i] = newArray[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 1;

        rotate(nums,k);
    }
}

