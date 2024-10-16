package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/16/2024
 */
public class BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 8, 10, 40, 60};
        int key = 10;
        int result = binarySearch(array, key);
        System.out.println(result);
    }

}
