package Leetcode;

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings_Leetcode2696 {
    public static void main(String[] args) {
        System.out.println(minLength("CCCDDD"));
    }
    public static int minLength(String s){
        //ABFCACDB
        Stack<Character>stack=new Stack<>();
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(stack.isEmpty())
          {
              stack.push(ch);
              continue;
          }
          else if(ch=='D' && stack.peek()=='C')
          {
              stack.pop();
          }
          else if(ch=='B' && stack.peek()=='A')
          {
              stack.pop();
          }
          else {
              stack.push(s.charAt(i));
          }
      }
       return stack.size();
    }
}
