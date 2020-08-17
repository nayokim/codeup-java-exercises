package DataStructures;

public class BigO {
    //describes the performance of an algorithm

    public void log(int [] numbers){
        // O(1) - all youre doing is priting the first item. It doesnt matter how big the array is, youre priting the first item.
        //single operation and takes constant amooutn of time.
        System.out.println(numbers[0]);
    }

    // O(2 + n) - > drop the constant values as they do not have huge impact when there are many inputs
//    public void logs (int[] nums){
//        System.out.println(); // O(1);
//        for (int i = 0; i < nums.length; i++){ // 0 (n)
//            System.out.println(nums[i]);
//            System.out.println(); // O (1)
//        }
//    }

    public void logs (int[] nums, String [] names){
  // O(n+m) - > O (n)
        for (int i = 0; i < nums.length; i++){ // 0 (n)
            System.out.println(nums[i]);
        }
        for (int i = 0; i < names.length; i++){ // 0 (m)
            System.out.println(names[i]);
        }
    }


    public static void main(String[] args) {

    }
}
