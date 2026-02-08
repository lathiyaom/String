
public class SubString {
    static void main() {
      String str ="CODE";

      //total = n(n+1)/2
        for(int i=0;i<str.length();i++){
           for(int j=i+1;j<=str.length();j++){

             System.out.println(str.substring(i,j));

           }
        }
    }
}
