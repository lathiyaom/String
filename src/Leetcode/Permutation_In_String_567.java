    package Leetcode;

    import java.util.Arrays;

    public class Permutation_In_String_567 {
        public static void main(String[] args) {
            System.out.println(checkInclusion("ab","eidboaoo"));
        }
        public static boolean checkInclusion(String p, String s) {
            if (p.length() > s.length()) return false;
            int[] f1 = new int[26], f2 = new int[26];
            for (int i = 0; i < p.length(); i++) {
                f1[p.charAt(i) - 'a']++;
                f2[s.charAt(i) - 'a']++;
            }
            for (int i = p.length(); i < s.length(); i++) {
                if (Arrays.equals(f1, f2)) return true;
                f2[s.charAt(i) - 'a']++;
                f2[s.charAt(i - p.length()) - 'a']--;
            }
            return Arrays.equals(f1, f2);
        }
    }
