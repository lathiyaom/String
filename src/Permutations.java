import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str="123";
     List<List<Integer>> ans=  Find_The_Permutations(str,"");
        System.out.println(ans);
    }

    private static List<List<Integer>> Find_The_Permutations(String str, String helper) {

        if(str.isEmpty())
        {
            List<List<Integer>>list=new LinkedList<>();
            List<Integer>l=new LinkedList<>();
            for(int i=0;i<helper.length();i++)
            {
                String s=String.valueOf(helper.charAt(i));
                l.add(Integer.parseInt(s));
            }
            list.add(l);
            return list;
        }
        char ch=str.charAt(0);
        List<List<Integer>>ans=new LinkedList<>();
        for(int i=0;i<=helper.length();i++)
        {
            String f=helper.substring(0,i);
            String s=helper.substring(i,helper.length());
            ans.addAll( Find_The_Permutations(str.substring(1),f+ch+s));
        }
        return ans;
    }
}
