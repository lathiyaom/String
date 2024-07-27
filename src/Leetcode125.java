public class Leetcode125 {
    public static void main(String[] args) {
        String str="race a car";
        int l=0;
         int r=str.length()-1;
         int diff='a'-'A';
         while(l<r)
         {
             char x=str.charAt(l);
             char y=str.charAt(r);
             if(!(Character.isDigit(l)||Character.isAlphabetic(l)))
             {
                 l++;
                 continue;
             }
             if(!(Character.isDigit(r)||Character.isAlphabetic(r)))
             {
                 r++;
                 continue;
             }
             if(isuppercase(x)){
                 x = (char) (x + diff);
             }
             if(isuppercase(y)){
                 y = (char)( y + diff);
             }

             if(x!=y){
                 System.out.println("false");
                 return;
             }
             l++;
             r--;
         }
        System.out.println("true");
    }
    public static boolean isuppercase(char c){
        return (  c>='A' && c<='Z');
    }
}
