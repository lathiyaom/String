import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Leetcode1624 {
    public static void main(String[] args) {
        /*
            Given a string s, return the length of the longest substring between two equal characters,
            excluding the two characters. If there is no such substring return -1.
             A substring is a contiguous sequence of characters within a string.
        */
        String str="pfwftcwdbiodyoojbebtwoyqemmsgmsryugkkcwykhtaczj";
        int ans= maxLengthBetweenEqualCharacters(str);
        System.out.println(ans);
    }

    private static int maxLengthBetweenEqualCharacters(String str) {
                int max=-1;

                int[]friq=new int[26];

                for(int i=0;i<str.length();i++)
                {
                    int id=str.charAt(i)-'a';
                    if(friq[id]>0)
                    {
                        //dosomthing
                        max=Math.max(max,i-friq[id]);
                    }
                    else {
                        friq[id]=i+1;
                    }
                }
                return max;
    }

}
