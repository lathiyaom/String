package Leetcode;
public class Reverse_Words_in_a_String_151 {
    static void main(String[] args) {
        String str = "the sky is blue";
        String[] strArray = str.split("\\s+");
        int left = 0;
        int right = strArray.length - 1;
        while (left < right) {
            String temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        str = "";
        for (String s : strArray) {
            str += s;
            str += " ";
        }
        str = str.trim();
        System.out.println(str);
    }
}
