import java.util.Arrays;

public class Sort_The_Array_0_1 {
    static void main() {
        System.out.println(Arrays.toString(SortTheArray(new int[]{0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1})));
    }

    private static int[] SortTheArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
