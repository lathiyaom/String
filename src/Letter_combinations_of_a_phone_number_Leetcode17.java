import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Letter_combinations_of_a_phone_number_Leetcode17 {
  final static String [] digitsString={"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
    List<String>ans=new LinkedList<>();
    String digits="23";
    backtrack(ans,digits,0,new char[digits.length()]);
        System.out.println(ans);
    }

    private static void backtrack(List<String> ans, String digits, int i, char[] chars) {
        if(i==digits.length())
        {
            if(chars.length!=0)
            {
                ans.add(new String(chars));
            }
            return;
        }
        String digitsValues=digitsString[digits.charAt(i)-'2'];
        for(char c:digitsValues.toCharArray())
        {
            chars[i]=c;
            backtrack(ans,digits,i+1,chars);
        }
    }

}
