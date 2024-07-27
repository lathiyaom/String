

public class ReplaceHactis{
    public static void main(String[] args) {
        String str="aBcD";//bAdC
        String ans=replaceCharacters(str);
        // a=97 to z=122
        //A=65 to Z=90
        //1=49 to 9=57
        //for even index to set the character a next if the present is
        // lower then lower and upper then upper
        System.out.println(ans);
    }

    private static String replaceCharacters(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((i&1)==0)
            {
                sb.append(incrementChar(c));
            }
            else {
                sb.append(decrementChar(c));
            }
        }
        return sb.toString();
    }

    private static char decrementChar(char c) {
        int codePoint = Character.codePointAt(new char[] { c }, 0);
        codePoint = (codePoint - 1) % Character.MAX_CODE_POINT;
        return (char) codePoint;
    }

    private static char incrementChar(char c) {
        int codePoint = Character.codePointAt(new char[] { c }, 0);
        codePoint = (codePoint + 1) % Character.MAX_CODE_POINT;
        return (char) codePoint;
    }
}
