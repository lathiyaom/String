import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode151 {
    public static void main(String[] args) {
        String str="a good   example";
       String ans=reverseWords(str);
        System.out.println(ans);
    }

    private static String reverseWords(String str) {
        //this is
            str=str.trim();
        List<String> stringList= Arrays.asList(str.split("\\s+"));
        Collections.reverse(stringList);
        return String.join(" ",stringList);
    }
}
