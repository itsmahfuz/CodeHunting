package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/12/2024
 */
public class LongestCommonPrefix {

//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"

    /*public String longestCommonPrefix(String[] strs) {
        if (strs.length > 0 && strs[0].isEmpty()) return "";
        String prefix = "";

        boolean breakFlag = false;
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (ch != strs[j].charAt(i)) {
                        breakFlag = true;
                    }
                } else breakFlag = true;
            }
            if (!breakFlag) {
                prefix += String.valueOf(ch).trim();
            }
        }
        return prefix;
    }*/

    public String longestCommonPrefix(String[] strs) {

        String rt = "";
        for (int i = 0; i < strs[0].length(); i++) {
            rt += strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    rt = rt.substring(0, rt.length() - 1);
                    return rt;
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    rt = rt.substring(0, rt.length() - 1);
                    return rt;
                }
            }
        }

        return rt;
    }


    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        System.out.println(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(lcp.longestCommonPrefix(new String[]{"ab", "a"}));
    }

}
