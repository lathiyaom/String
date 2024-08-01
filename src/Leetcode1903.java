public class Leetcode1903 {
    public static void main(String[] args) {
//            String str="35427";
//            int s=0;
//           int l=str.length()-1;
//           while(l>=0)
//           {
//               if((str.charAt(l)&1)==1)
//               {
//                   break;
//               }
//               l--;
//           }
//        System.out.println(str.substring(0,l+1));
//        System.out.println(ok.get(4));
        int[]arr={1,2,3,90};
        int ans=ok.get(arr,0,90);
        System.out.println(ans);
    }

}
class  ok
{
    public static int  get(int[]arr,int i,int x)
    {
        if(i==arr.length)
        {
            return -1;
        }
        return (arr[i]==x)?i:get(arr,i+1,x);
    }
}
