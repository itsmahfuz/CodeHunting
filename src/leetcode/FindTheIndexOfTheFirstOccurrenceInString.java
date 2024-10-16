package leetcode;

/**
 * @author Mahfuzur Rahman
 * @Date 10/16/2024
 */
public class FindTheIndexOfTheFirstOccurrenceInString {

//    Input: haystack = "sadbutsad", needle = "sad"
//    Output: 0
//    Explanation: "sad" occurs at index 0 and 6.
//    The first occurrence is at index 0, so we return 0.


    public int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else return -1;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInString f = new FindTheIndexOfTheFirstOccurrenceInString();
        System.out.println(f.strStr("sadbutsad", "sad"));
    }

}
