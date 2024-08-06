import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.TreeMap;

public class Kth_distinct_string_in_an_array_Leetcode2053  {
    public static void main(String[] args) {
        String []arr={"a","b","a"};
         int k=3;
        HashMap<String , Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int a=map.get(arr[i]);
                if(a==1)
                {
                  ans++;
                }
                if(ans==k)
                {
                    System.out.println(arr[i]);
                    return;
                }
            }

        }
    }
}
