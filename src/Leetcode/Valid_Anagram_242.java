package Leetcode;

import java.util.Arrays;

public class Valid_Anagram_242 {
    static void main() {
        String s = "anagram";
        String t = "nagarsam";
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);
        Arrays.sort(sarr);
        System.out.println(new String(sarr).equals(new String(tarr)));
    }
}
