package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/1/2024
 */

public class ValidParentheses {

    public boolean isValid(String s) {

        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {

        ValidParentheses v = new ValidParentheses();
        v.isValid("()[]{}");
    }

}
