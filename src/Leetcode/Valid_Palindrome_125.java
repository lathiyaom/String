package Leetcode;

public class Valid_Palindrome_125 {
    static void main() {
        String str = " ";
        str = str.trim();
        if (str.length() <= 1) {
            System.out.println("True");
        } else {
            str = RemoveOtherThenChars(str);
            StringBuilder stringBuilder = new StringBuilder(str);
            System.out.println(str.equalsIgnoreCase(stringBuilder.reverse().toString()));
        }
    }

    private static String RemoveOtherThenChars(String str) {
        String ans = "";
        for (Character ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                continue;
            } else {
                ans += ch;
            }
        }
        return ans;
    }
}
