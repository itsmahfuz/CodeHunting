package leetcode;

import java.util.List;

/**
 * @author Mahfuzur Rahman
 * @Date 10/15/2024
 */
public class LengthOfLastWord {

//    Input: s = "Hello World"
//    Output: 5
//    Explanation: The last word is "World" with length 5.

    public int lengthOfLastWord(String s) {

        String[] str  = s.split(" ");
        return str[str.length-1].length();

    }

    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord("Hello World"));
    }
}
