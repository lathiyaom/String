public class Leetcode1903 {
    public static void main(String[] args) {
            String str="35427";
            int s=0;
           int l=str.length()-1;
           while(l>=0)
           {
               if((str.charAt(l)&1)==1)
               {
                   break;
               }
               l--;
           }
        System.out.println(str.substring(0,l+1));
    }
}
