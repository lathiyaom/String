package Q;

public class Check_palindrome {
    static void main() {
        String str = "AbA";
        if (str.equals(reversString(str))) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }

    static String reversString(String str) {
        char[] chars = str.toCharArray();
        int l = 0;
        int r = chars.length - 1;

        while (l < r) {

            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }
}
