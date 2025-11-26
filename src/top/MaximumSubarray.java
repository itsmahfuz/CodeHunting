package top;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maxValue = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxValue) {
                maxValue = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }
}
