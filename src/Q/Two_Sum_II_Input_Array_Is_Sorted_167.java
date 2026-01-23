package Q;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {
    static void main() {

        twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(ans[0] + "" + ans[1]);
        return ans;

    }
}
