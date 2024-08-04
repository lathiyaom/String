public class Basic_Q {
    public static void main(String[] args) {
        String str="absbbbababababa";
        System.out.println(SkipTheCharacter(str,'b',0));
    }

    private static String SkipTheCharacter(String str, char a, int i) {
        String halper = "";
        if(i>=str.length())
        {
            return halper;
        }
        if(str.charAt(i)!=a)
        {
            halper+=str.charAt(i);
        }
        String hh=SkipTheCharacter(str,a,i+1);
        str+=hh;
        return str;
    }
}
