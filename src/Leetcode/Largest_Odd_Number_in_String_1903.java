package Leetcode;

public class Largest_Odd_Number_in_String_1903 {
    static void main() {
        System.out.println(largestOddNumber("53529624"));

    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) return num.substring(0, i + 1);
        }
        return "";
    }
}
