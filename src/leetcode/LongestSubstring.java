package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {



    public static int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        String str = "";
        int max = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(String.valueOf(s.charAt(i)))) {
                str += String.valueOf(s.charAt(i));
            } else {
                if (i != 0) i = index++;
                str = "";
            }
            if (max < str.length()) max = str.length();
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));;
    }
}
