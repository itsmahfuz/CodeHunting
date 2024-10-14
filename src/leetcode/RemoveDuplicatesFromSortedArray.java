package leetcode;

import java.util.*;

/**
 * @author Mahfuzur Rahman
 * @Date 10/12/2024
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i ++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {1, 2, 3, 4};

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i]);
        }
    }

}