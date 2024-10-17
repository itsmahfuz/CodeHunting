package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/17/2024
 */
public class SingleNumber {

//    Example 2:
//    Input: nums = [4,1,2,1,2]
//    Output: 4

    public int singleNumber(int[] nums) {

//        if (nums.length == 1) return nums[0];
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            boolean isExits = false;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    isExits = true;
//                    break;
//                }
//            }
//            if (!isExits) return nums[i];
//            else i += 1;
//        }
//        return 0;

        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

}
