package Leetcode;

import java.util.Stack;

public class Minimum_Add_To_Make_Parentheses_Valid_Leetcode_921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }


    public static int minAddToMakeValid(String s) {
        int open =0, mismatch=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
                open++;
            else
            {
                if(open>0)
                    open--;
                else
                    mismatch++;
            }
        }
        return open+mismatch;
    }
}
