
public class SubString {
    static void main() {
      String str ="cabbac";
        int ans =-1;
      //total = n(n+1)/2
        for(int i=0;i<str.length();i++){
           for(int j=i+1;j<=str.length();j++){
            String substring = str.substring(i,j);
            if(substring.charAt(0)==substring.charAt(substring.length()-1) && substring.length()>=2){
                int length=substring.length()-2;
               ans= Math.max(ans,length);
            }
           }
        }
        System.out.println(ans);
    }
}
