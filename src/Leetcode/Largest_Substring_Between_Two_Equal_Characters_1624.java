package Leetcode;

public class Largest_Substring_Between_Two_Equal_Characters_1624 {
    static void main() {
        maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv");
    }

    public static int maxLengthBetweenEqualCharacters(String str) {
        int[] index = new int[26];
        int ans = -1;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (index[idx] > 0) {
                ans = Math.max(ans, i - index[idx]);
            } else {
                index[idx] = i + 1;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
