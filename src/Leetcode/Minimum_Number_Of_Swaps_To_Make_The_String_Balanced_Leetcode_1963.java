package Leetcode;

public class Minimum_Number_Of_Swaps_To_Make_The_String_Balanced_Leetcode_1963 {
    public static void main(String[] args) {

    }
    public  static int minSwaps(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[')
                size++;
            else if (size > 0)
                size--;
        }
        return (size + 1) / 2;
    }
}
