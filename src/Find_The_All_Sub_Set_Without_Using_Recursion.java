import java.util.ArrayList;
import java.util.List;

public class Find_The_All_Sub_Set_Without_Using_Recursion {
    public static void main(String[] args) {
        int[]arr={1,2,2};
        List<List<Integer>>ans=SubSet(arr);
        for(List<Integer>a:ans)
        {
            System.out.println(a);
        }
    }
    private static List<List<Integer>>SubSet(int[]arr)
    {
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int a:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer>internal=new ArrayList<>(outer.get(i));
                if(outer.contains(a ))continue;
                internal.add(a);
                outer.add(internal);
            }
        }
        return outer;
    }
}
