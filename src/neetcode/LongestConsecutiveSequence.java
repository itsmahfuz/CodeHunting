package neetcode;

import java.util.*;

/**
 * @author Mahfuzur Rahman
 * @Date 10/9/2024
 */
public class LongestConsecutiveSequence {

//    Input: nums = [2,20,4,10,3,4,5]
//    Output: 4
//    Explanation: The longest consecutive sequence is [2, 3, 4, 5].

//    Input: nums = [0,3,2,5,4,6,1,1]
//    Output: 7

    public int longestConsecutive(int[] nums) {

        HashSet<TreeSet<Integer>> collect = new HashSet<>();

        if (nums.length == 0) return 0;
        else if (nums.length == 1) return 1;

        Arrays.sort(nums);

        TreeSet<Integer> set = new TreeSet<>();
        int j = 0;
        for (int i = 0; j < nums.length -1; i++) {
            j = i + 1;

            set.add(nums[i]);
            if (nums[j] - nums[i] == 1 || Math.abs(nums[j]) - Math.abs(nums[i]) == 0) {
                set.add(nums[j]);
            } else {
                collect.add(set);
                set = new TreeSet<>();
                set.add(nums[j]);
            }
        }
        collect.add(set);

        ArrayList<TreeSet<Integer>> list = new ArrayList<>(collect);
        return list.get(list.size() - 1).size();
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.longestConsecutive(new int[]{2,20,4,10,3,4,5}));;
    }
}
