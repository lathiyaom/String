import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicalNumbersLeetcode386 {
   static List<Integer>ans=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ans.clear();
        lexicalOrder(n,1);
        System.out.println(ans);
    }
    private static void lexicalOrder(int n,int curr) {

        if(curr>n)
            return;
        ans.add(curr);

        lexicalOrder(n,curr*10);
        if(curr%10!=9)
        {
            lexicalOrder(n,curr+1);
        }
    }
}