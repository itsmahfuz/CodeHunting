package neetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/8/2024
 */
public class ValidateParenthesis {

//    Input: s = "([{}])"
//    Output: true

    public boolean isValid(String s) {

        while (!s.isEmpty()) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidateParenthesis v = new ValidateParenthesis();
        System.out.println(v.isValid("([{}])"));
    }


}
