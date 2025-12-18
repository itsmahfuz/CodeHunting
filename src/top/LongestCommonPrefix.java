package top;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs[0].isEmpty()) return prefix;
        for (int i = 0; i < strs[0].length(); i++) {
            prefix += strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() -1 < i) {
                    return prefix = prefix.substring(0, prefix.length() - 1);
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}
