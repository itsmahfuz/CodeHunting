package neetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char iVal = s.charAt(i);

            if (Character.isAlphabetic(iVal) || Character.isDigit(iVal)) {
                sb.append(iVal);
            }
        }

        String rev = sb.toString();
        String forW = sb.reverse().toString();

        return rev.equalsIgnoreCase(forW);

    }

    public static void main(String[] args) {

        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
