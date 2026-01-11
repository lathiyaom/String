import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("",4));
    }
    private static List<String> dice(String str, int target) {
        if (target == 0)
        {

            List<String>l=new LinkedList<>();
            l.add(str);
            return l;
        }
        List<String>ans=new LinkedList<>();
        for(int i=1;i<=6&&i<=target;i++)
        {
          ans.addAll(  dice(str+i,target-i));
        }
        return ans;
    }
}
