
public class ReplaceAscii {
    static void main() {
        String str = "cdeFg";
        System.out.println(ChangeTheAscii(str));

    }

    public static  String  ChangeTheAscii(String str){
            if(str.isEmpty()) return "";
            char[] ch = str.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(i%2==0){

                    ch[i]= (char) (ch[i]+1);
                }else{
                    ch[i]= (char) (ch[i]-1);
                }
            }
            return new String(ch);
    }
}
