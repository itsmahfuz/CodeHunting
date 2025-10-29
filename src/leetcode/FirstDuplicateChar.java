package leetcode;

import java.util.LinkedHashMap;

public class FirstDuplicateChar {

    public static char findDup() {
        String str = "leetcode";

        char value = 0;

        for (int i = 0; i < str.length(); i++) {
            value = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                break;
            }
        }

        return value;
    }

    public static char findDupByMap() {
        String str = "leetcode";
        char value = 0;
        LinkedHashMap<Character, Integer> mapValue = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (mapValue.containsKey(str.charAt(i))) {
                mapValue.replace(str.charAt(i), mapValue.get(str.charAt(i)) + 1);
            } else mapValue.put(str.charAt(i), 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (mapValue.get(str.charAt(i)) > 1) {
                value = str.charAt(i);
            }
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(findDup());
    }

}
