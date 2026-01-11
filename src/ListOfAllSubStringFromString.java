import java.util.ArrayList;
import java.util.List;

public class ListOfAllSubStringFromString {
    public static void main(String[] args) {
        String str="abc";

        //the output is a,ab,abc,b,bc,c
        //formula to how many substring i can get from a length n*(n+1)/2
        List<String>ans=FindTheAllSubString(str);
        ans.forEach(i->{
            System.out.println(i);
        });
    }

    private static List<String> FindTheAllSubString(String str) {
        int n=str.length();
        List<String>stringList=new ArrayList<>(n*(n+1)/2);
        char[]ch=str.toCharArray();
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    stringList.add(new String(ch,i,j-i+1));
                }
            }
        return stringList;
    }
}
