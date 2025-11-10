package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 1;
        int value = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]) + 1;
                map.replace(nums[i], count);

                if (maxCount < count) {
                    maxCount = count;
                    value = nums[i];
                }
            } else {
                map.put(nums[i], count);
            }
        }


        return value;

    }


    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(majorityElement(nums));
    }
}
