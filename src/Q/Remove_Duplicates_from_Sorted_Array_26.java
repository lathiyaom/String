package Q;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {
    static void main() {
        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3, 4});
    }

    //,1,1,1,2,2,3,3,4
    public static int removeDuplicates(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r - 1) {
            if (nums[l] != nums[l + 1]) {
                l++;
            }
            int index = l;
            while (index < r && nums[l] != nums[index + 1]) {
                int temp = nums[index];
                nums[index] = nums[index + 1];
                nums[index] = temp;
                index++;
            }
            l++;
        }
        System.out.println(Arrays.toString(nums));
        return 1;
    }
}
