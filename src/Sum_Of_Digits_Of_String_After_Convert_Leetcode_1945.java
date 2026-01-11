public class Sum_Of_Digits_Of_String_After_Convert_Leetcode_1945
{
    public static void main(String[] args) {
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        for (int i = 1; i < k; i++) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }
}
