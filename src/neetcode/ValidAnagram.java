package neetcode;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }

    public static void main(String[] args) {

        ValidAnagram va = new ValidAnagram();
        String s = "racecar", t = "carrace";
        System.out.println(va.isAnagram(s, t));

    }
}
