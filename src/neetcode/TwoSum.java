package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mahfuzur Rahman
 * @Date 10/7/2024
 */
public class TwoSum {


    List<Integer> list = new ArrayList<>();

    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;

                    break;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 4, 5, 6}, 7)));
    }

}
