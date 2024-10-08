package neetcode;

import java.util.*;

/**
 * @author Mahfuzur Rahman
 * @Date 10/8/2024
 */
public class GroupAnagram {

//    Input: strs = ["act","pots","tops","cat","stop","hat"]
//    Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

    public List<List<String>> groupAnagrams(String[] strs) {

//        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
        }
//        map.forEach((key, value) -> ans.add(value));
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagram ga = new GroupAnagram();
        List<List<String>> result = ga.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println(result);
    }
}
