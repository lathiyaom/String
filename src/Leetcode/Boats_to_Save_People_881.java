package Leetcode;

import java.util.Arrays;

public class Boats_to_Save_People_881 {
    static void main() {
        int ans = numRescueBoats(new int[]{2, 2}, 6);
        System.out.println(ans);
    }

    public static int numRescueBoats(int[] people, int limit) {
//        3,5,3,4
        Arrays.sort(people);
        int ans = 0;
        // 3 3 4 5
        int start = 0;
        int end = people.length - 1;
        while (start <= end) {
            if (people[start] + people[end] == limit || people[start] + people[end] < limit) {
                ans++;
                start++;
                end--;
            } else if (people[start] + people[end] > limit) {
                ans++;
                end--;
            } else {
                start++;
                ans++;
            }
        }
        return ans;
    }
}
