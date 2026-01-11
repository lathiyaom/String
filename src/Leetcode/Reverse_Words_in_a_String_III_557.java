package Leetcode;

public class Reverse_Words_in_a_String_III_557 {
    static void main() {
        String str = "Mr Ding";
        String[] strArray = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            sb.append(ReversWords(s)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    private static String ReversWords(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}
