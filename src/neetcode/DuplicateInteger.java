package neetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mahfuzur Rahman
 * @Date 10/7/2024
 */
public class DuplicateInteger {

    public boolean hasDuplicate(int[] nums) {

//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;

        Set<Integer> hashSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])) {
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateInteger d = new DuplicateInteger();
        System.out.println(d.hasDuplicate(new int[]{1, 2, 3, 3}));
    }



}
