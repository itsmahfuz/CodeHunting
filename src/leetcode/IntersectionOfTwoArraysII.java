package leetcode;

import java.util.*;

/**
 * @author Mahfuzur Rahman
 * @Date 10/17/2024
 */
public class IntersectionOfTwoArraysII {

//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//    Explanation: [4,9] is also accepted.

    public static int[] intersection(int[] nums1, int[] nums2) {

        TreeMap<Integer,LinkedList<Integer>> num1Map = new TreeMap<>();
        TreeMap<Integer,LinkedList<Integer>> num2Map = new TreeMap<>();

        for (int n : nums1) {
            if (num1Map.containsKey(n)) {
                num1Map.get(n).add(n);
            } else {
                num1Map.put(n, new LinkedList<>());
                num1Map.get(n).add(n);
            }
        }

        for (int n : nums2) {
            if (num2Map.containsKey(n)) {
                num2Map.get(n).add(n);
            } else {
                num2Map.put(n, new LinkedList<>());
                num2Map.get(n).add(n);
            }
        }

        List<Integer> list = new ArrayList<>();
        num1Map.forEach((k, v) -> {
            if (num2Map.containsKey(k)) {
                int length = Math.min(num2Map.get(k).size(), num1Map.get(k).size());
                for (int i = 0; i < length; i++) {
                    list.add(k);
                }
            }
        });

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
