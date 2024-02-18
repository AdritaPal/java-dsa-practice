package org.example.sorting.leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i <= r;) {
            if (nums[i] == 0) {
                nums[l] += nums[i] - (nums[i] = nums[l]); // Swap nums[i] and nums[l]
                i++; l++;
            }
            else if (nums[i] == 1)
                ++i;
            else {
                nums[i] += nums[r] - (nums[r] = nums[i]); // Swap nums[i] and nums[r]
                r--;
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
