package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/16/2024
 */
public class SearchInsertPosition {

//    Example 1:
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4

    public int searchInsert(int[] nums, int target) {

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > target || nums[i] == target) {
//                return i;
//            }
//        }
//        return nums.length;

//        with binary search for O(log n).

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 2, 5, 6, 7, 8, 9, 10}, 3));
    }


}
