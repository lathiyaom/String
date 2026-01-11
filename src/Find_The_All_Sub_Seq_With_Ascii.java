import java.util.ArrayList;

public  class Find_The_All_Sub_Seq_With_Ascii {
    public static void main(String[] args) {
        String str="abc";

        System.out.println(FindTheAllSubSeqWithAscii("",str));
    }
    private  static ArrayList<String>FindTheAllSubSeqWithAscii(String helper,String str)
    {
        if(str.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(helper);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String>l1=FindTheAllSubSeqWithAscii(helper+ch,str.substring(1));
        ArrayList<String>l2=FindTheAllSubSeqWithAscii(helper,str.substring(1));
        ArrayList<String>l3=FindTheAllSubSeqWithAscii(helper+(ch+0),str.substring(1));
        l1.addAll(l2);
        l1.addAll(l3);
        return l1;
    }
}
