package top;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String forwardStr = "";
        String reverseStr = "";
        for (int i = 0; i < s.length(); i++) {
            char iVal = s.charAt(i);
            if (Character.isLetterOrDigit(iVal)) {
                forwardStr += iVal;
                reverseStr = iVal + reverseStr;
            }
        }
        return reverseStr.equalsIgnoreCase(forwardStr);
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }
}
