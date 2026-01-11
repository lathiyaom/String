package Leetcode;

public class Length_of_Last_Word_58 {
    static void main() {
        String str = "   fly me   to   the moon  ";
        str.trim();
        String[] strArray = str.split("\\s+");
            System.out.println(strArray[strArray.length - 1].length());
    }
}
