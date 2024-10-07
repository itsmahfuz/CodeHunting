package neetcode;

import java.util.Arrays;

/**
 * @author Mahfuzur Rahman
 * @Date 10/7/2024
 */
public class IsAnagram {


    public boolean isAnagram(String s, String t) {

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("jar", "jam"));
    }

}
