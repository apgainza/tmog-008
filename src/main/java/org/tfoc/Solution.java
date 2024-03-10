package org.tfoc;

import java.util.Objects;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    int left, right;

    public Integer search(
            Integer[] nums,
            Integer target) {

        left = 0;
        right = nums.length - 1;

        return binarySearch(nums, target);
    }

    private Integer binarySearch(Integer[] nums, Integer target) {
        int m = (right + left) / 2;
        if (left > right)
            return null;

        if (Objects.equals(nums[m], target))
            return m;

        if (nums[m] > target)
            right = m - 1;
        else
            left = m + 1;

        return binarySearch(nums, target);
    }
}
