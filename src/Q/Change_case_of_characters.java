package Q;

public class Change_case_of_characters {
    static void main() {
        String str = "aBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDDDDDDDDDDDDDFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
        char[] ch = str.toCharArray();
        int i = 0;
        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                ch[i] = (char) (c - 32);
                i++;
            } else if (c >= 'A' && c <= 'Z') {
                ch[i] = (char) (c + 32);
                i++;
            }
        }
        System.out.println(new String(ch));
    }
}
