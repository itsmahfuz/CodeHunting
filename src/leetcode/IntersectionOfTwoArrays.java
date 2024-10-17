package leetcode;

import java.util.*;

/**
 * @author Mahfuzur Rahman
 * @Date 10/17/2024
 */
public class IntersectionOfTwoArrays {

//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//    Explanation: [4,9] is also accepted.

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int n1 : nums1) {
            for (int n2 : nums2) {

                if (n1 == n2) {
                    set.add(n1);
                    break;
                }
            }
        }

        int[] result = new int[set.size()];

        int index = 0;
        for (Integer value : set) {
            result[index++] = value;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 4, 5};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
