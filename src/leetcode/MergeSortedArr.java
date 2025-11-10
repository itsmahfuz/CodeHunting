package leetcode;

import java.util.*;

public class MergeSortedArr {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] resultArr = new int[m + n];
        int lastAdd = 0;

        for (int i = 0; i < m; i++) {
            resultArr[lastAdd] = nums1[i];
            lastAdd++;
        }

        for (int i = 0; i < n; i++) {
            resultArr[lastAdd] = nums2[i];
            lastAdd++;
        }

        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr.length - i - 1; j++) {

                if (resultArr[j] > resultArr[j + 1]) {
                    int temp = resultArr[j + 1];
                    resultArr[j + 1] = resultArr[j];
                    resultArr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArr rd = new MergeSortedArr();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        rd.merge(nums1, m, nums2, n);
    }


}
