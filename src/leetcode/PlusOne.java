package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Mahfuzur Rahman
 * @Date 10/15/2024
 */
public class PlusOne {

    /** Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2]. */

    public int[] plusOne(int[] digits) {

//        String s = "";
//        for (int d : digits) {
//            s += d;
//        }
//        BigInteger number = new BigInteger(s).add(BigInteger.ONE);
//        String numberStr = number.toString();
//        int[] result = new int[numberStr.length()];
//        for (int i = 0; i < numberStr.length(); i++) {
//            result[i] = Character.getNumericValue(numberStr.charAt(i));
//        }
//        return result;

//        Alternative

        for (int i = digits.length - 1; i > - 1; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        int [] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        System.out.println(Arrays.toString(p.plusOne(new int[]{9,9,9,9})));
    }

}
