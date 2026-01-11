package Leetcode;

public class Longest_Common_Prefix_14 {
    static void main() {
        String[] str = {"dog", "racecar", "car"};
        if (str[0].length() == 0) {
//            return "";
        }
        System.out.println(" ");
        if (str.length == 1) {
//            return str[0];
            System.out.println(str[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str[0].length(); i++) {
            if (!CheckExistOrNot(str, i, str[0].charAt(i))) {
                System.out.println(sb.toString());
                break;
            } else {
                sb.append(str[0].charAt(i));
            }
        }
        System.out.println(sb.toString());

    }

    public static boolean CheckExistOrNot(String[] str, int index, char ch) {
        for (int i = 1; i < str.length; i++) {
            String string = str[i];
            if (index >= string.length() || string.charAt(index) != ch) {
                return false;
            }
        }
        return true;
    }
}
