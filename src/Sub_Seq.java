import java.util.ArrayList;

public class Sub_Seq {
    public static void main(String[] args) {
        String str="bl";

        ArrayList<String>a1=SubSeq(str,"");
        ArrayList<String >a2=SubSeq("yby","");
        System.out.println(a1+" "+a2);
        int ans=0;
        for(int i=0;i<Math.min(a1.size(),a2.size());i++)
        {
            if(a1.contains(a2.get(i)))
            {
                System.out.println(a1.get(i));
                ans=Math.max(ans,a2.get(i).length());
            }
        }
        System.out.println(ans);
    }

    private static ArrayList<String> SubSeq(String str, String helper) {

        if(str.isEmpty())
        {
            ArrayList<String >a=new ArrayList<>();
            a.add(helper);
            return a;
        }
        char ch=str.charAt(0);
 ArrayList<String > a1=      SubSeq(str.substring(1),helper+ch);
        ArrayList<String > a2=   SubSeq(str.substring(1),helper);
        a1.addAll(a2);
        return a1;
    }
}
