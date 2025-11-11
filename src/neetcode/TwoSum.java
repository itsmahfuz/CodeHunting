package neetcode;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int iVal = nums[i];

            for (int j = 0; j < nums.length; j++) {
                int jVal = nums[j];

                if (iVal + jVal == target) {
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }
}
