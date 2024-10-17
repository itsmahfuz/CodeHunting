package leetcode;

import java.util.Arrays;

/**
 * @author Mahfuzur Rahman
 * @Date 10/17/2024
 */
public class MissingNumber {

//    Input: nums = [3,0,1]
//    Output: 2
//    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

//        if (nums[0] != 0) return 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] - nums[i] > 1 ) {
//                return nums[i] + 1;
//            }
//        }
//
//        return nums.length;

        if (nums[0] != 0) return 0;
        else if (nums.length != nums[nums.length-1]) return nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1 ) {
                return nums[i] + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{3,0,1}));
    }

}
