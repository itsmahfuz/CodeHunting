package neetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Mahfuzur Rahman
 * @Date 10/7/2024
 */
public class IsPalindrome {

    String s = "Was it a car or a cat I saw?";

    public boolean isPalindrome(String s) {
//        s = s.toLowerCase().trim().replace(" ", "");
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.toString().equals(s);


        StringBuilder str= new StringBuilder();

        for(char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                str.append(ch);
            }
        }


        return str.toString().equalsIgnoreCase(str.reverse().toString()) ;

    }

    public static void main(String[] args) {
        IsPalindrome p = new IsPalindrome();
        System.out.println(p.isPalindrome("Was it a car or a cat I saw?"));
    }

}
